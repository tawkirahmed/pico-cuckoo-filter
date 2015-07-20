package org.pico.collection.mutable.array.bit.syntax

import org.scalacheck.Gen

import scala.util.Random

package object gen {
  def genBytes(size: Int) = Gen.wrap(Gen.listOfN(size, Gen.wrap(Gen.const(Random.nextInt().toByte))).map(_.toArray))

  def genShorts(size: Int) = Gen.wrap(Gen.listOfN(size, Gen.wrap(Gen.const(Random.nextInt().toShort))).map(_.toArray))

  def genInts(size: Int) = Gen.wrap(Gen.listOfN(size, Gen.wrap(Gen.const(Random.nextInt()))).map(_.toArray))

  def genLongs(size: Int) = Gen.wrap(Gen.listOfN(size, Gen.wrap(Gen.const(Random.nextLong()))).map(_.toArray))
}

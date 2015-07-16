package org.pico.collection.mutable.array.bit.syntax

import org.scalacheck.{Arbitrary, Gen}
import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

class ByteBitArraySpec extends Specification with ScalaCheck {
  case class Offset(value: Long)

  implicit val arbitraryOffset = Arbitrary[Offset](Gen.choose(0L, 128L).map(Offset))

  "Values that are set can be retrieved again" in {
    prop { (v: Byte, offset: Offset) =>
      val buffer = new Array[Byte](130)
      buffer.byte(offset.value, Put(v))
      buffer.byte(offset.value) ==== v
    }
  }
}
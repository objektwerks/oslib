package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import os.*

class OSLibTest extends AnyFunSuite with Matchers:
  val path = pwd / "target" / "oslib"
  makeDir.all(path)
  assert( exists(path) )

  test("write > read") {
    write(path / "test.txt", "test")
    read(path / "test.txt") shouldBe "test"
  }
package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import os.*

class OSLibTest extends AnyFunSuite with Matchers:
  val path = pwd / "target" / "oslib"
  makeDir( path )

  test("write > read") {
    exists(path) shouldBe true
  }
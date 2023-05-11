package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

import os.*

class OSLibTest extends AnyFunSuite with Matchers:
  val target = pwd / "target"

  test("write > read") {
    println(target)
  }
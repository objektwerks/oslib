package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

import os.*

class OSLibTest extends AnyFunSuite with Matchers:
  val path = pwd / "target" / "oslib"
  makeDir( path )

  test("write > read") {
    assert( exists(path) )
  }
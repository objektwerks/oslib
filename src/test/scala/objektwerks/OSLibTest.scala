package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import os.*

class OSLibTest extends AnyFunSuite with Matchers:
  val path = pwd / "target" / "oslib"
  makeDir.all(path)
  assert( exists(path) )

  test("os") {
    write.over(path / "test.txt", "test")
    read(path / "test.txt") shouldBe "test"
    list(path).length shouldBe 1
    
    copy(path / "test.txt", path / "test.copy.txt")
    read(path / "test.copy.txt") shouldBe "test"
    list(path).length shouldBe 2
  }
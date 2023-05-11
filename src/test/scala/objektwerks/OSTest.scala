package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import os.*

class OSTest extends AnyFunSuite with Matchers:
  val path = pwd / "target" / "oslib"

  test("os") {
    remove.all(path)
    makeDir(path)

    exists(path) shouldBe true
    isDir(path) shouldBe true

    write(path / "test.txt", "test")
    read(path / "test.txt") shouldBe "test"

    isFile(path / "test.txt") shouldBe true
    list(path).length shouldBe 1
    
    copy(path / "test.txt", path / "test.copy.txt")
    read(path / "test.copy.txt") shouldBe "test"

    isFile(path / "test.copy.txt") shouldBe true
    list(path).length shouldBe 2
  }
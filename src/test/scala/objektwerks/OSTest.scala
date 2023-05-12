package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import os.*

class OSTest extends AnyFunSuite with Matchers:
  val path = pwd / "target" / "oslib"
  val copyPath = pwd / "target" / "oslib-copy"

  test("os") {
    remove.all(path)
    remove.all(copyPath)
    makeDir(path)

    exists(path) shouldBe true
    isDir(path) shouldBe true

    write(path / "test.txt", "text")
    read(path / "test.txt") shouldBe "text"

    isFile(path / "test.txt") shouldBe true
    list(path).length shouldBe 1
    
    copy(path / "test.txt", path / "test.copy.txt")
    read(path / "test.copy.txt") shouldBe "text"

    isFile(path / "test.copy.txt") shouldBe true
    list(path).length shouldBe 2

    write.append(path / "test.txt", " appended text")
    read(path / "test.txt") shouldBe "text appended text"

    copy.over(path, copyPath)
    isDir(copyPath) shouldBe true

    val lines = walk(path)
      .filter(_.ext == "txt")
      .map(os.read.lines)
      .map(_.size)
      .sum
    lines shouldBe 2

    proc("ls", path).call().exitCode shouldBe 0
    proc("ls", copyPath).call().exitCode shouldBe 0
  }
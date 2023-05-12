package objektwerks

import os.*

@main def runWalk(): Unit =
  val path = pwd / "src"
  val dir = walk(path)
  dir.foreach(println)

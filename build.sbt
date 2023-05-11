name := "oslib"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.0-RC5"
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %% "os-lib" % "0.9.1",
    "ch.qos.logback" % "logback-classic" % "1.4.7",
    "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )
}
name := "oslib"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.4-RC1"
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %% "os-lib" % "0.11.4-M5",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wall"
)

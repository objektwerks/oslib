name := "oslib"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.9.0-RC3"
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %% "os-lib" % "0.11.9-M8",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)

name := "oslib"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.4.0"
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %% "os-lib" % "0.9.3",
    "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)

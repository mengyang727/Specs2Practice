name := "Specs2Practice"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.0.2" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")
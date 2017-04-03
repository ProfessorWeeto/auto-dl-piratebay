name := "auto-dl-piratebay"

version := "1.0"

scalaVersion := "2.12.1"

// Read here for optional jars and dependencies
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8.9" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")
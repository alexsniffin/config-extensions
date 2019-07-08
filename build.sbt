name := "config-extensions"
description := "A lightweight library for general purpose bin-packing of a collection with arbitrary values."
version := "1.0.0"
organization := "com.github.alexsniffin"
scalaVersion := "2.12.8"
credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credential")
publishTo := sonatypePublishTo.value

libraryDependencies += "com.typesafe" % "config" % "1.3.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % Test
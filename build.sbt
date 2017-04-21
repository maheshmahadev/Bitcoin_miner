name := "HelloWorld"

version := "1.0"

scalaVersion := "2.10.4"


resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies +=  "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT"

libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.4-SNAPSHOT"
import sbt._
import sbt.Keys._

object AkkaActorsRemotingScalaBuild extends Build {

  lazy val akkaActorsRemotingScala = Project(
    id = "akka-actors-remoting-scala",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Akka Actors Remoting Scala",
      organization := "se.op.example.akka",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies ++= Seq(
          "com.typesafe.akka" % "akka-actor" % "2.0.3",
          "com.typesafe.akka" % "akka-remote" % "2.0.3",
          "com.typesafe.akka" % "akka-kernel" % "2.0.3")
    )
  )
}

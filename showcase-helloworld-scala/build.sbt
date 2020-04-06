import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "showcase.hello_world"

resolvers += Resolver.jcenterRepo

lazy val root = (project in file("."))
  .settings(
    name := "hello_world",
    mainClass in assembly := Some("showcase.hello_world.Main"),
  )

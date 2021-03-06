val scala3Version = "3.1.0"

val http4sVersion = "0.23.6"

lazy val root = project
  .in(file("."))
  .settings(
    name := "pg-scala3-http4s",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-dsl" % http4sVersion,
      "org.http4s" %% "http4s-blaze-server" % http4sVersion,
      "org.http4s" %% "http4s-blaze-client" % http4sVersion,
      "org.typelevel" %% "cats-effect" % "3.3.0",
      "org.scalatest" %% "scalatest" % "3.2.10" % "test"
    )
  )

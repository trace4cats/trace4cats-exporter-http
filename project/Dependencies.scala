import sbt._

object Dependencies {
  object Versions {
    val scala212 = "2.12.16"
    val scala213 = "2.13.8"
    val scala3 = "3.2.0"

    val trace4cats = "0.14.0"

    val http4s = "0.23.14"

    val kindProjector = "0.13.2"
    val betterMonadicFor = "0.3.1"
  }

  lazy val trace4catsKernel = "io.janstenpickle" %% "trace4cats-kernel" % Versions.trace4cats

  lazy val http4sClient = "org.http4s" %% "http4s-client" % Versions.http4s

  lazy val kindProjector = ("org.typelevel" % "kind-projector"     % Versions.kindProjector).cross(CrossVersion.full)
  lazy val betterMonadicFor = "com.olegpy" %% "better-monadic-for" % Versions.betterMonadicFor
}

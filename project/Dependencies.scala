import sbt._

object Dependencies {
  object Versions {
    val scala212 = "2.12.14"
    val scala213 = "2.13.6"

    val trace4cats = "0.12.0-RC1+156-7ea07b63"

    val http4s = "0.23.0-RC1"
  }

  lazy val trace4catsKernel = "io.janstenpickle" %% "trace4cats-kernel" % Versions.trace4cats

  lazy val http4sClient = "org.http4s" %% "http4s-client" % Versions.http4s
}

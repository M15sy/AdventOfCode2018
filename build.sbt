
// Projects

lazy val root = project
  .in(file("."))
  .aggregate(solutions, cli)

lazy val solutions = project
  .settings(
    name := "solutions",
    libraryDependencies ++= testDependencies
  )

lazy val cli = project
  .settings(
    name := "cli",
  )
  .dependsOn(solutions)


// Dependencies

lazy val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)


// Settings

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "missy"


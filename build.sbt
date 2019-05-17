import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "AdventOfCode2018",
    libraryDependencies += scalaTest % Test
  )

scapegoatVersion in ThisBuild := "1.3.3"
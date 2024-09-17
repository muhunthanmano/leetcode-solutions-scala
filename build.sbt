ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "3.3.3"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.11" % Test


lazy val root = (project in file("."))
  .settings(
    name := "leetCodeSolutions"
  )


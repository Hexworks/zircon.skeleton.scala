import Dependencies._

name := "zircon.skeleton.scala"

ThisBuild / organization := "org.hexworks.zircon"
ThisBuild / organizationName := "Hexworks"
ThisBuild / version := "1.0.0"
ThisBuild / scalaVersion := "2.13.7"

ThisBuild / scalafixDependencies += Plugin.organizeImports
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "utf-8",
  "-explaintypes",
  "-feature",
  "-language:higherKinds",
  "-Wdead-code",
  "-Wextra-implicit",
  "-Wmacros:both",
  "-Wnumeric-widen",
  "-Woctal-literal",
  "-Wunused:explicits",
  "-Wunused:implicits",
  "-Wunused:imports",
  "-Wunused:linted",
  "-Wunused:locals",
  "-Wunused:patvars",
  "-Wunused:privates",
  "-Wvalue-discard",
  "-Xlint:adapted-args",
  "-Xlint:constant",
  "-Xlint:delayedinit-select",
  "-Xlint:deprecation",
  "-Xlint:doc-detached",
  "-Xlint:eta-sam",
  "-Xlint:eta-zero",
  "-Xlint:implicit-not-found",
  "-Xlint:implicit-recursion",
  "-Xlint:inaccessible",
  "-Xlint:infer-any",
  "-Xlint:missing-interpolator",
  "-Xlint:nonlocal-return",
  "-Xlint:nullary-unit",
  "-Xlint:option-implicit",
  "-Xlint:poly-implicit-overload",
  "-Xlint:private-shadow",
  "-Xlint:serial",
  "-Xlint:stars-align",
  "-Xlint:type-parameter-shadow",
  "-Xlint:valpattern",
  "-Xsource:3"
)

ideExcludedDirectories := Seq(
  baseDirectory.value / ".bsp",
  baseDirectory.value / ".idea",
  baseDirectory.value / "project" / "project",
  baseDirectory.value / "target"
)

Global / excludeLintKeys += ideExcludedDirectories

libraryDependencies ++= Seq(Lib.scalatest, Lib.zirconCore, Lib.zirconSwing)

name := "$name;format="lower,word"$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaversion$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

lazy val root = (project in file(".")).
    enablePlugins(ConscriptPlugin).settings()


val `scala-kendoui-slick` = project.in(file("."))
  .enablePlugins(OssLibPlugin)
  .settings(
    organization := "com.thenewmotion",
    name := "scala-kendoui-slick",
    libraryDependencies ++= {
      val liftVersion =
        if (scalaVersion.value startsWith "2.11") "2.6.2"
        else "2.5.1"

      Seq(
        "com.typesafe.slick" %% "slick" % "2.1.0",
        "com.thenewmotion" %% "time" % "2.8",
        "org.slf4j" % "slf4j-api" % "1.7.12",

        "net.liftweb" %% "lift-webkit" % liftVersion,
        "net.liftweb" %% "lift-json-ext" % liftVersion,

        "com.h2database" % "h2" % "1.4.186" % "test",
        "org.specs2" %% "specs2-core" % "3.6.1" % "test"
      )
    }
  )

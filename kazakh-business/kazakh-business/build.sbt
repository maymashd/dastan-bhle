
name := "kazakh-business"

version := "1.0.0"

scalaVersion := "2.12.8"

val akkaHttpVersion =  "10.1.1"
val akkaVersion = "2.5.9"
val json4sVersion = "3.5.4"


resolvers += "spray repo" at "http://repo.spray.io"
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-xml" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "org.json4s" %% "json4s-core" % json4sVersion,
  "org.json4s" %% "json4s-jackson" % json4sVersion,
  "org.json4s" %% "json4s-native" % json4sVersion,

  "de.heikoseeberger" %% "akka-http-json4s" % "1.20.1",
  "com.typesafe" % "config" % "1.3.3",
  "com.typesafe.slick" %% "slick" % "3.3.0",
  "org.postgresql" % "postgresql" % "42.2.5",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.0",
  "com.zaxxer" % "HikariCP" % "3.3.1",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.github.tototoshi" %% "slick-joda-mapper" % "2.3.0",
  "kz.one.lab" % "movie_domain_2.12" % "1.0.0",
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-xml" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "org.json4s" %% "json4s-core" % json4sVersion,
  "org.json4s" %% "json4s-jackson" % json4sVersion,
  "org.json4s" %% "json4s-native" % json4sVersion,

  "de.heikoseeberger" %% "akka-http-json4s" % "1.20.1",
  "com.typesafe" % "config" % "1.3.3",
  "com.typesafe.slick" %% "slick" % "3.3.0",
  "org.postgresql" % "postgresql" % "42.2.5",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.0",
  "com.zaxxer" % "HikariCP" % "3.3.1",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.github.tototoshi" %% "slick-joda-mapper" % "2.3.0"
)


enablePlugins(JavaAppPackaging)

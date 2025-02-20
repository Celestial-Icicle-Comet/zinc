scalacOptions += "-feature"

addSbtPlugin("com.github.sbt" % "sbt-dynver" % "5.0.1")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("org.scala-sbt" % "sbt-contraband" % "0.5.3")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.6")
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.10.0")
addSbtPlugin("com.github.sbt" % "sbt-protobuf" % "0.7.2")
libraryDependencies += "com.github.os72" % "protoc-jar" % "3.11.4"
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.1.3")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.11.0")
addSbtPlugin("com.eed3si9n" % "sbt-projectmatrix" % "0.9.1")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.1.4")
addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings" % "1.1.1")

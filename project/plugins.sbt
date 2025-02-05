addSbtPlugin("org.scalameta"      % "sbt-scalafmt"                  % "2.4.5")
addSbtPlugin("ch.epfl.scala"      % "sbt-scalafix"                  % "0.10.4")
addSbtPlugin("com.github.cb372"   % "sbt-explicit-dependencies"     % "0.2.10")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "1.9.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "1.1.0")
addSbtPlugin("com.eed3si9n"       % "sbt-buildinfo"                 % "0.11.0")
addSbtPlugin("com.geirsson"       % "sbt-ci-release"                % "1.5.7")
addSbtPlugin("com.dwijnand"       % "sbt-dynver"                    % "4.0.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"                       % "1.1.2")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"                  % "3.9.12")
addSbtPlugin("org.scalameta"      % "sbt-mdoc"                      % "2.3.2")
addSbtPlugin("com.eed3si9n"       % "sbt-unidoc"                    % "0.4.3")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.1.0")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.4.4")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"                       % "0.4.3")
addSbtPlugin("de.heikoseeberger"  % "sbt-header"                    % "5.6.0")

libraryDependencies += "org.snakeyaml" % "snakeyaml-engine" % "2.5"
libraryDependencies += "dev.zio"      %% "zio"              % "2.0.2"
libraryDependencies += "io.circe"     %% "circe-yaml"       % "0.14.2"

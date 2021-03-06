lazy val commonSettings = Seq(
    organization := "com.mandubian"
  , version := "0.2.0"
  , resolvers ++= Seq(
      Resolver.mavenLocal
    , Resolver.sonatypeRepo("releases")
    , Resolver.sonatypeRepo("snapshots")
    )
  // , scalaVersion := "2.11.8"
  , scalaVersion := "2.11.8"
  , bintrayOrganization := Some("mandubian")
  , licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
  , addCompilerPlugin("com.milessabin" % "si2712fix-plugin" % "1.2.0" cross CrossVersion.full)
  , addCompilerPlugin("org.spire-math" %% "kind-projector"  % "0.7.1")
  , libraryDependencies ++= Seq(
      "org.typelevel"   %% "cats"               % "0.5.0"
    , "com.milessabin"  % "si2712fix-library"   % "1.2.0"             cross CrossVersion.full
    , "org.scalatest"   %  "scalatest_2.11"     % "2.1.3"             % "test"
    )

)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "freek",
    scalacOptions ++= Seq(
      "-feature"
    , "-language:higherKinds"
    )
  )
name := "scalanlp-tutorial"

organization := "com.github.PhysicsEngine"

version := "0.0.1"

scalaVersion := "2.10.2"


libraryDependencies  ++= Seq(
            "org.scalanlp" % "breeze-math_2.10" % "0.3",
            "org.scalanlp" % "breeze-learn_2.10" % "0.3",
            "org.scalanlp" % "breeze-process_2.10" % "0.3",
            "org.scalanlp" % "breeze-viz_2.10" % "0.3"
)

resolvers ++= Seq(
            "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
            "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/releases/"
)



//initialCommands := "import com.github.PhysicsEngine.scalanlptutorial._"

name := "deeplearning"

version := "1.0"

scalaVersion := "2.11.5"
libraryDependencies ++= Seq("org.deeplearning4j" % "deeplearning4j-core" % "0.4-rc3.4",
                            "org.nd4j" % "nd4j-jblas" % "0.4-rc3.4",
                            "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test")

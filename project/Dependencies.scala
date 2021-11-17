import sbt._

object Dependencies {

  object Ver {
    val scalatest = "3.2.10"
    val zircon    = "2021.1.0-RELEASE"
  }

  object Lib {
    val scalatest   = "org.scalatest"      %% "scalatest"        % Ver.scalatest % Test
    val zirconCore  = "org.hexworks.zircon" % "zircon.core-jvm"  % Ver.zircon
    val zirconSwing = "org.hexworks.zircon" % "zircon.jvm.swing" % Ver.zircon
  }

  object Plugin {
    val organizeImports = "com.github.liancheng" %% "organize-imports" % "0.6.0"
  }

}

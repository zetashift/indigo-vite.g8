import org.scalajs.linker.interface.ModuleSplitStyle
import indigoplugin.IndigoOptions

lazy val gameOptions =
  IndigoOptions.defaults
    .withTitle("$full_title$")
    .withWindowSize(1280, 720)
    .withAssetDirectory(os.RelPath.rel / "assets")

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "$name$",
    scalaVersion := "3.3.1",
    scalacOptions ++= Seq("-encoding", "utf-8", "-deprecation", "-feature"),
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(
          ModuleSplitStyle.SmallModulesFor(List("$name$"))
        )
    },
    indigoOptions := gameOptions
  )
  .settings(
    libraryDependencies ++= Seq(
      "io.indigoengine" %%% "indigo" % "0.15.2"
    )
  )


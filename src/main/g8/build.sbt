import org.scalajs.linker.interface.ModuleSplitStyle

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
    }
  )
  .settings(
    showCursor := true,
    title := "$full_title$",
    gameAssetsDirectory := "assets",
    windowStartWidth := 720, // Width of Electron window, used with `indigoRun`.
    windowStartHeight := 480, // Height of Electron window, used with `indigoRun`.
    libraryDependencies ++= Seq(
      "io.indigoengine" %%% "indigo" % "0.15.2"
    )
  )


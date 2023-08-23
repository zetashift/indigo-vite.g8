package $name$

import indigo.*
import scala.scalajs.js.annotation.JSExportTopLevel

@JSExportTopLevel("IndigoGame")
object MyGame extends IndigoDemo[Unit, Unit, Model, Unit]:
  def updateViewModel(
      context: FrameContext[Size],
      model: PongGame,
      viewModel: Unit
  ): GlobalEvent => Outcome[Unit] = _ => Outcome(())

  def boot(flags: Map[String, String]): Outcome[BootResult[Unit]] =
    Outcome(BootResult(()))

  def eventFilters: EventFilters = EventFilters.Permissive

  def updateModel(context: FrameContext[Unit], model: Model): GlobalEvent => Outcome[Model] =
    Outcome(model)

  def updateViewModel(context: FrameContext[Unit], model: Model, viewModel: Unit): GlobalEvent => Outcome[ViewModel] =
    ???

  def present(context: FrameContext[Unit], model: Model, viewModel: Unit): Outcome[SceneUpdateFragment] =
    Outcome(
      SceneUpdateFragment.empty
    )

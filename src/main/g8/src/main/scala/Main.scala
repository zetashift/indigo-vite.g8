package $name$

import indigo.*
import scala.scalajs.js.annotation.JSExportTopLevel

case class Model(player: Unit)
object Model:
  def init: Model = Model(player = ())

@JSExportTopLevel("IndigoGame")
object $name$ extends IndigoDemo[Unit, Unit, Model, Unit]:
  def boot(flags: Map[String, String]): Outcome[BootResult[Unit]] =
    Outcome(BootResult(GameConfig.default, ()))

  def eventFilters: EventFilters = EventFilters.Permissive

  def initialModel(startupData: Unit): Outcome[Model] = Outcome(Model.init)

  def initialViewModel(startupData: Unit, model: Model): Outcome[Unit] =
    Outcome(())

  def setup(
      bootData: Unit,
      assetCollection: AssetCollection,
      dice: Dice
  ): Outcome[Startup[Unit]] = Outcome(Startup.Success(()))

  def updateModel(
      context: FrameContext[Unit],
      model: Model
  ): GlobalEvent => Outcome[Model] =
    _ => Outcome(model)

  def updateViewModel(
      context: FrameContext[Unit],
      model: Model,
      viewModel: Unit
  ): GlobalEvent => Outcome[Unit] =
    _ => Outcome(())

  def present(
      context: FrameContext[Unit],
      model: Model,
      viewModel: Unit
  ): Outcome[SceneUpdateFragment] =
    Outcome(
      SceneUpdateFragment.empty
    )

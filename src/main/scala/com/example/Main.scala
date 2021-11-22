package com.example

import org.hexworks.zircon.api.CP437TilesetResources
import org.hexworks.zircon.api.ColorThemes
import org.hexworks.zircon.api.Components
import org.hexworks.zircon.api.SwingApplications
import org.hexworks.zircon.api.application.AppConfig
import org.hexworks.zircon.api.component.Label
import org.hexworks.zircon.api.data.Position
import org.hexworks.zircon.api.data.Size
import org.hexworks.zircon.api.grid.TileGrid
import org.hexworks.zircon.api.screen.Screen

object Main extends App {

  val tileGrid: TileGrid = SwingApplications.startTileGrid(
    AppConfig
      .newBuilder()
      // The number of tiles horizontally, and vertically
      .withSize(Size.create(60, 30))
      // You can choose from a wide array of CP437, True Type or Graphical tilesets
      // which are built into Zircon
      .withDefaultTileset(CP437TilesetResources.rogueYun16x16())
      .build()
  )

  // A Screen is an abstraction which lets you use text GUI Components.
  // You can have multiple Screens attached to the same TileGrid to be able
  // to create multiple screens for your app
  val screen: Screen = Screen.create(tileGrid)

  // Creating text GUI Components is super simple
  val label: Label = Components
    .label()
    .withText("Hello, Zircon!")
    .withPosition(Position.create(23, 10))
    .build()

  // Screens can hold GUI components
  screen.addComponent(label)

  screen.display()

  // Zircon comes with a plethora of built-in color themes
  screen.setTheme(ColorThemes.arc())

}

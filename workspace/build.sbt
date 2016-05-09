import sbt._
import Process._
import Keys._


lazy val commonSettings = Seq(
  organization := "se.lth.cs",
  version := "16.1",
  scalaVersion := "2.11.8"
)

lazy val cslib = (project in file("cslib")).
  settings(commonSettings: _*).
  settings(
    name := "cslib"
  )

  
lazy val w03_bugs =(project in file("w03_bugs")).
  settings(commonSettings: _*).
  settings(
    name := "w03_bugs",
    EclipseKeys.skipProject := true    
  ).dependsOn(cslib)
  
lazy val w04_pirates =(project in file("w04_pirates")).
  settings(commonSettings: _*).
  settings(
    name := "w04_pirates"
  ).dependsOn(cslib)  

  
lazy val w05_cards =(project in file("w05_cards")).
  settings(commonSettings: _*).
  settings(
    name := "w05_cards"
  ).dependsOn(cslib)  
  
  
lazy val w06_turtlegraphics =(project in file("w06_turtlegraphics")).
  settings(commonSettings: _*).
  settings(
    name := "w06_turtlegraphics"
  ).dependsOn(cslib)

  
lazy val w07_turtlerace_team =(project in file("w07_turtlerace_team")).
  settings(commonSettings: _*).
  settings(
    name := "w07_turtlerace_team"
  ).dependsOn(cslib)
      
lazy val w08_chords_team =(project in file("w08_chords_team")).
  settings(commonSettings: _*).
  settings(
    name := "w08_chords_team"
  ).dependsOn(cslib)

  
lazy val w09_maze =(project in file("w09_maze")).
  settings(commonSettings: _*).
  settings(
    name := "w09_maze"
  ).dependsOn(cslib)  
  
lazy val w10_surveydata_team =(project in file("w10_surveydata_team")).
  settings(commonSettings: _*).
  settings(
    name := "w10_surveydata_team"
  ).dependsOn(cslib)  

  
lazy val w11_lthopoly_team =(project in file("w11_lthopoly_team")).
  settings(commonSettings: _*).
  settings(
    name := "w11_lthopoly_team"
  ).dependsOn(cslib)  
  
  
lazy val w12_life =(project in file("w12_life")).
  settings(commonSettings: _*).
  settings(
    name := "w12_life"
  ).dependsOn(cslib)

  
lazy val w13_bank_proj =(project in file("w13_bank_proj")).
  settings(commonSettings: _*).
  settings(
    name := "w13_bank_proj"
  ).dependsOn(cslib)

lazy val w13_img_proj =(project in file("w13_img_proj")).
  settings(commonSettings: _*).
  settings(
    name := "w13_img_proj"
  ).dependsOn(cslib)

lazy val w13_tictactoe_proj =(project in file("w13_tictactoe_proj")).
  settings(commonSettings: _*).
  settings(
    name := "w13_tictactoe_proj"
  ).dependsOn(cslib)

lazy val workspace = (project in file(".")). 
  settings(commonSettings: _*).
  settings(
    name := "workspace" ,
    EclipseKeys.withSource := true,
    EclipseKeys.skipProject := true,
    EclipseKeys.skipParents in ThisBuild := true  
    // https://github.com/typesafehub/sbteclipse/wiki/Using-sbteclipse
 )



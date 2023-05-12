package objektwerks

import os.*

object ChuckNorisApp:
  def main(args: Array[String]): Unit =
    proc("curl", "-L" , "https://api.chucknorris.io/jokes/random")
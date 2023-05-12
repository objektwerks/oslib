package objektwerks

import os.*

object ChuckNorrisApp:
  @main def run(): Unit = proc("curl", "https://api.chucknorris.io/jokes/random").call(stdout = Inherit)
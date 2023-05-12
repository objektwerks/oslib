package objektwerks

import os.*

@main def run(): Unit = proc("curl", "https://api.chucknorris.io/jokes/random").call(stdout = Inherit)
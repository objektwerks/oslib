package objektwerks

import os.*

@main def runProc(): Unit = proc("curl", "https://api.chucknorris.io/jokes/random").call(stdout = Inherit)
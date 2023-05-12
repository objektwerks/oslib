package objektwerks

import os.*

@main def run(): Unit = proc("curl", "-L" , "https://api.chucknorris.io/jokes/random")
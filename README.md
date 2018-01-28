# redwall

A Redcode virtual machine

## Overview

A reference implementation of [ICWS94](http://corewar.co.uk/standards/icws94.htm) for running [CoreWar](https://en.wikipedia.org/wiki/Core_War).

## Setup

To get an interactive development environment run:

    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL. 

## References & Prior Art

 - http://vyznev.net/corewar/guide.html
 - https://github.com/rm-hull/corewar

## License

Copyright © 2018 Charles L.G. Comstock

Distributed under the MIT Public License, see LICENSE file

# RheinwerkAdventure

Dies ist der Versuch das Rheinwerk Adventure aus dem Videotraining "Spieleprogrammieren für Einsteiger"
von Tom Wendel in Java nachzustellen.
Das Videotraining ist vom Rheinwerkverlag aus dem Jahr 2016.
Alle Ressourcen werden noch getrennt bei Erscheinen aufgeführt.

Referenzen:
===========

Tilesets
========
Hyptosis (http://hyptosis.newgrounds.com/)
Lost Garden (http://www.lostgarden.com/2006/07/more-free-game-graphics.html)
Zabin (http://opengameart.org/users/zabin)

Maps
====
Die Maps wurden im Rahmen des Videotrainings des Rehinwerkverlags zu diesem
Videotutorial erstellt und werden von mir als solche weiter genutzt.

Sprites
=======
http://gaurav.munjal.us/Universal-LPC-Spritesheet-Character-Generator/
Client Bellanger (http://opengameart.org/content/animated-coins)

UI
==
http://kenney.nl/assets/ui-pack-rpg-expansion

Sounds
======
Sword: Mike Koenig (http://soundbible.com/1176-Sword-Swing.html)
Click: Mike Koenig (http://soundbible.com/1258-Tick-Tock.html)
Hit: Mark DiAngelo (http://soundbible.com/2069-Realistic-Punch.html)
Coin: Luke.RUSTLTD (http://opengameart.org/content/10-8bit-coin-sounds)

Musik
=====
woodloop: http://www.playonloop.com/2013-music-loops/deep-emerald/
houseloop: http://www.playonloop.com/2014-music-loops/go-doge-go/
townloop: http://www.playonloop.com/2015-music-loops/cookie-island/
menuloop: http://www.playonloop.com/2010-music-loops/elevators/


Sonstige Quellen und Anlaufpunkte:
==================================
- http://opengameart.org/
- http://kenney.nl/
- http://www.playonloop.com/
- http://audiojungle.net/
- Assets Stores f r RPG-Maker, Unity,...

Fonts
=====
"Asset-Pack 1" von http://kenney.nl/



LibGDX Preferences:
===================


A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/libgdx/gdx-liftoff).

This project was generated with a template including simple application launchers and an `ApplicationAdapter` extension that draws libGDX logo.

## Platforms

- `core`: Main module with the application logic shared by all platforms.
- `lwjgl3`: Primary desktop platform using LWJGL3; was called 'desktop' in older docs.

## Gradle

This project uses [Gradle](https://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `idea`: generates IntelliJ project data.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.

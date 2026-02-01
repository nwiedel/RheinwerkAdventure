package de.nicolas;

import de.nicolas.screens.LevelScreen;
import utils.game.BaseGame;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class RheinwerkGame extends BaseGame {

    @Override
    public void create() {
        super.create();
        setActiveScreen(new LevelScreen());
    }
}

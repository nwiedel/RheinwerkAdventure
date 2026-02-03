package de.nicolas.screens;

import de.nicolas.RheinwerkGame;
import utils.actors.TileMapActor;
import utils.screens.BaseScreen;

public class LevelScreen extends BaseScreen {

    private RheinwerkGame game;

    private TileMapActor tma;

    public LevelScreen(RheinwerkGame game){
        this.game = game;
        tma = new TileMapActor(game.getWorld().getAreas().get(0).getMapLocation(), mainStage);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void update(float delta) {

    }
}

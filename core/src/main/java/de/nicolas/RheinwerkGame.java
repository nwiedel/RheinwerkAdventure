package de.nicolas;

import de.nicolas.model.Area;
import de.nicolas.model.World;
import de.nicolas.screens.LevelScreen;
import utils.game.BaseGame;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class RheinwerkGame extends BaseGame {

    private World world;
    private Area town;
    private Area shop;
    private Area wood;

    public RheinwerkGame(){
        world = new World();
        town = new Area("assets/Maps/town.tmx");
        shop = new Area("assets/Maps/shop.tmx");
        wood = new Area("assets/Maps/wood.tmx");
        world.addAreas(town);
        world.addAreas(shop);
        world.addAreas(wood);
    }

    @Override
    public void create() {
        super.create();
        setActiveScreen(new LevelScreen(this));
    }

    public World getWorld() {
        return world;
    }
}

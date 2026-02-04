package de.nicolas.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.utils.ScreenUtils;
import de.nicolas.RheinwerkGame;
import de.nicolas.model.Area;
import de.nicolas.model.Player;
import de.nicolas.model.World;
import utils.Utils;
import utils.actors.TileMapActor;
import utils.screens.BaseScreen;

public class LevelScreen extends BaseScreen {

    private World world;
    private Area town;
    private Area shop;
    private Area wood;

    private Player player;

    private TileMapActor tma;

    @Override
    public void initialize() {

        world = new World();
        town = new Area("assets/Maps/town.tmx");
        shop = new Area("assets/Maps/shop.tmx");
        wood = new Area("assets/Maps/wood.tmx");
        world.addAreas(town);
        world.addAreas(shop);
        world.addAreas(wood);

        tma = new TileMapActor(town.getMapLocation(), mainStage);

        // Player
        MapObject startPoint = tma.getRectangleList("Player").get(0);
        MapProperties props = startPoint.getProperties();
        player = new Player((float)props.get("x"), (float) props.get("y"), mainStage);
    }

    @Override
    public void render(float delta) {
        mainStage.act(delta);
        uiStage.act(delta);

        update(delta);

        ScreenUtils.clear(Utils.CORNFLOWER_BLUE);

        mainStage.draw();
        tma.getTiledMapRenderer().render(tma.getLayerForeground());
        uiStage.draw();
    }

    @Override
    public void update(float delta) {

        // Spieler Bewegung
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            player.accelerateAtAngle(180);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            player.accelerateAtAngle(0);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)){
            player.accelerateAtAngle(90);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            player.accelerateAtAngle(270);
        }
    }
}

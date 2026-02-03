package de.nicolas.model;

import com.badlogic.gdx.scenes.scene2d.Stage;
import utils.actors.TileMapActor;

public class Area {

    private String mapLocation;

    public Area(String mapLocation){
        this.mapLocation = mapLocation;
    }

    public String getMapLocation() {
        return mapLocation;
    }
}

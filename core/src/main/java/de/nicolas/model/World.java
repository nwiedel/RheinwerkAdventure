package de.nicolas.model;

import utils.actors.TileMapActor;

import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Area> areas;

    public World(){
        areas = new ArrayList<>();
    }

    public void addAreas(Area area){
        areas.add(area);
    }

    public List<Area> getAreas() {
        return areas;
    }
}

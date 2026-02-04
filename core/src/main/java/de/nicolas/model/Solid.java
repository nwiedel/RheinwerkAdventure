package de.nicolas.model;

import com.badlogic.gdx.scenes.scene2d.Stage;
import utils.actors.BaseActor;

public class Solid extends BaseActor {

    public Solid(float x, float y, float width, float height, Stage stage) {
        super(x, y, stage);
        setSize(width, height);
        setBoundaryRectangle();
    }
}

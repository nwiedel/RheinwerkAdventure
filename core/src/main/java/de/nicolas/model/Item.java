package de.nicolas.model;

import com.badlogic.gdx.scenes.scene2d.Stage;
import de.nicolas.utils.actors.BaseActor;

public class Item extends BaseActor {

    protected boolean fixed;
    protected float mass;

    public Item(float x, float y, Stage stage) {
        super(x, y, stage);
        fixed = false;
        mass = 1f;
    }
}

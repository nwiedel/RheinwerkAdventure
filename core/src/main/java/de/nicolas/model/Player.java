package de.nicolas.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;
import utils.actors.BaseActor;

public class Player extends BaseActor {



    public Player(float x, float y, Stage stage) {
        super(x, y, stage);

        loadTexture("assets/button.png");
        setSize(32, 32);

        setBoundaryPolygon(8);
        setAcceleration(400);
        setMaxSpeed(100);
        setDeceleration(400);
    }

    @Override
    public void act(float delta) {
        super.act(delta);

        boundToWorld();
        applyPhysics(delta);
    }
}

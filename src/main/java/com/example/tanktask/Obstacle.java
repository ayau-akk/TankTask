package com.example.tanktask;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Obstacle extends Pane {
    private double x;
    private double y;
    private boolean breakable;
    private boolean goThrough;
    private String type;
    private ImageView imageView;

    public Obstacle(double x, double y, boolean breakable, boolean goThrough, String type) {
        this.x = x;
        this.y = y;
        this.breakable = breakable;
        this.goThrough = goThrough;
        this.type = type;
        if (type.equals("Green")){
            imageView = new ImageView(new Image("file:tank-assets/PNG/Obstacles/barrelGreen_side.png"));
            imageView.setX(this.x);
            imageView.setY(this.y);
            getChildren().add(imageView);
        }
        else if(type.equals("Red")){
            imageView = new ImageView(new Image("file:tank-assets/PNG/Obstacles/barrelRed_side.png"));
            imageView.setX(this.x);
            imageView.setY(this.y);
            getChildren().add(imageView);
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        imageView.setX(x);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        imageView.setY(y);
    }

    public boolean isBreakable() {
        return breakable;
    }

    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }

    public boolean isGoThrough() {
        return goThrough;
    }

    public void setGoThrough(boolean goThrough) {
        this.goThrough = goThrough;
    }
}

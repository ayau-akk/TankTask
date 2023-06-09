package com.example.tanktask;

import javafx.scene.image.ImageView;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public boolean equals(Position p){
        if (p.x == this.x && p.y == this.y){
            return true;
        }
        return false;
    }
}

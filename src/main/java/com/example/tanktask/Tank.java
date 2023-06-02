package com.example.tanktask;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Tank  {
    private double x;
    private double y;
    private int health;
    private ImageView tank;
    private Map map;

    public Tank(Map map, int health,String type){

        this.map = map;
     this.x = map.getStart().getX()* map.getPixel();
     this.y = map.getStart().getY()*map.getPixel();
     this.health = health;
     if (type.equals("BLACK")){
         tank= new ImageView(new Image("file:tank-assets/PNG/Tanks/tankBlack.png"));
         tank.setX(this.x);
         tank.setY(this.y);
         map.getChildren().add(tank);
     }
     else if (type.equals("BLUE")){
         tank= new ImageView(new Image("file:tank-assets/PNG/Tanks/tankBlue.png"));
         tank.setX(this.x);
         tank.setY(this.y);
         map.getChildren().add(tank);
     }

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void moveUp(){
        this.y = this.y -1;
        tank.setY(tank.getY()-map.getPixel());
    }
    public void moveDown(){
        this.y = this.y +1;
        tank.setY(tank.getY()+map.getPixel());
    }
    public void moveLeft(){
        this.x = this.x-1;
        tank.setX(tank.getX()-map.getPixel());
    }
    public void moveRight(){
        this.x = this.x+1;
        tank.setX(tank.getX()+map.getPixel());
    }
}

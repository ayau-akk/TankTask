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
    private Bullet bullet;

    public Tank(Map map, int health,String type){
        this.map = map;
     this.x = map.getStart().getX()* map.getPixel();
     this.y = map.getStart().getY()*map.getPixel();
     this.health = health;
     bullet = new Bullet(map);
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
        bullet.setDirection('U');
        this.y = this.y -1;
        tank.setY(tank.getY()-map.getPixel());
        tank.setRotate(180);
    }
    public void moveDown(){
        bullet.setDirection('D');
        this.y = this.y +1;
        tank.setY(tank.getY()+map.getPixel());
        tank.setRotate(0);
    }
    public void moveLeft(){
        bullet.setDirection('L');
        this.x = this.x-1;
        tank.setX(tank.getX()-map.getPixel());
        tank.setRotate(90);
    }
    public void moveRight(){
        bullet.setDirection('R');
        this.x = this.x+1;
        tank.setX(tank.getX()+map.getPixel());
        tank.setRotate(270);
    }
    public void shoot(){
        System.out.println("Shooting");
        bullet.addbul(tank.getX()*map.getPixel(), tank.getY()*map.getPixel(),map.getPixel()/2);
        bullet.play();
    }
}

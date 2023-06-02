package com.example.tanktask;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Bullet  {
    private Timeline motion;
    private int speed=60;
    private char direction;
    private Map map;
    public Bullet(Map map) {
        this.map=map;
        motion = new Timeline(
                new KeyFrame(Duration.millis(speed), e -> shootBullet()));
        motion.setCycleCount(Timeline.INDEFINITE);
    }
    public void addbul(double x, double y, double radius){
        map.getChildren().add(new BulletCircle(x,y,radius));
    }
    public void play() {
        motion.play();
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    protected void shootBullet(){
        for (Node node:map.getChildren()) {
            BulletCircle ball = (BulletCircle) node;
            switch (getDirection()){
                case 'U':
                    if (ball.getCenterY() - map.getPixel() < 0) {
                        map.getChildren().remove(ball);
                    }

                    else {
                        ball.setCenterY(ball.getCenterY() - map.getPixel());
                    }
                    break;

                case 'D':
                    if (ball.getCenterY() + map.getPixel() > map.getHeight())
                        map.getChildren().remove(ball);
                    else {
                        ball.setCenterY(ball.getCenterY() + map.getPixel());

                    }
                    break;
                case 'L':
                    if (ball.getCenterX() - map.getPixel() < 0)
                        map.getChildren().remove(ball);
                    else {
                        ball.setCenterX(ball.getCenterX() - map.getPixel());
                    } break;
                case 'R':
                    if (ball.getCenterX() + map.getPixel() > map.getWidth())

                        map.getChildren().remove(ball);
                    else {
                        ball.setCenterX(ball.getCenterX() + map.getPixel());
                    }break;

            }
        }
    }
}
class BulletCircle extends Circle{


    public BulletCircle(double v, double v1, double v2) {
        super(v, v1, v2);
    }


}
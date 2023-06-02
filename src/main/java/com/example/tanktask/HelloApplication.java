package com.example.tanktask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Map map = new Map();
        Tank tank = new Tank(map,4,"BLACK");
        Tank tank1 = new Tank(map,4,"BLUE");
//        tank1.setX(map.getStart().getX()*map.getPixel()-map.getPixel());
//        tank1.setY(map.getStart().getY()*map.getPixel()-map.getPixel());
        Scene scene = new Scene(map);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        map.requestFocus();
        map.setOnKeyPressed(e->{
            try {
                switch (e.getCode()) {
                    case UP -> {
                        tank1.moveUp();
                    }
                    case DOWN -> {
                        tank1.moveDown();
                    }
                    case LEFT -> {
                        tank1.moveLeft();
                    }
                    case RIGHT -> {
                        tank1.moveRight();
                    }
                    case W-> {
                        if (tank.getY()*map.getPixel()-map.getPixel()<=0){
                            return;
                        }
                        System.out.println("UP");
                        tank.moveUp();

                    }
                    case S -> {
                        if (tank.getY()*map.getPixel()+map.getPixel()>=250){
                            return;
                        }
                        System.out.println("DOWN");
                        tank.moveDown();

                    }
                    case A -> {
                        if (tank.getX()*map.getPixel()-map.getPixel()<=0){
                            return;
                        }
                        System.out.println("LEFT");
                        tank.moveLeft();

                    }
                    case D -> {
                        if (tank.getX()*map.getPixel()+map.getPixel()>=stage.getWidth()){
                            return;
                        }
                        System.out.println("RIGHT");
                        tank.moveRight();

                    }
                    case SPACE -> {
                        tank.shoot();
                        System.out.println("SPACE");
                    }

//                    case SPACE:
//                        bullet.addbul(position.getX()*map.getPixSize()+map.getPixSize()/2, position.getY()*map.getPixSize()+map.getPixSize()/2,map.getPixSize()/4);
//                        bullet.play();break;
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}
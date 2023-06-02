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
        Scene scene = new Scene(map);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        map.requestFocus();
        map.setOnKeyPressed(e->{
            try {
                switch (e.getCode()) {
                    case W-> {
                        System.out.println("UP");
                        tank.moveUp();

                    }
                    case S -> {
                        System.out.println("DOWN");
                        tank.moveDown();

                    }
                    case A -> {
                        System.out.println("LEFT");
                        tank.moveLeft();

                    }
                    case D -> {
                        System.out.println("RIGHT");
                        tank.moveRight();

                    }
                    case SPACE -> {
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
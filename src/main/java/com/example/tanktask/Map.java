package com.example.tanktask;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Map extends Pane {
    private int mapArray[][] = {
            {0,0,1,0,0},
            {0,0,0,0,0},
            {1,0,1,1,1},
            {1,0,0,0,0},
            {1,0,1,0,2}};

    private int size;
    private double pixel=60;
    private ImageView img;
    private Position start;
    private Obstacle obstacle;
    private Obstacle obstacles[];

    public Map()  {
        requestFocus();
        size = mapArray.length;

        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {

                 if (mapArray[i][j]==0  ){
                     ImageView imageView= new ImageView(new Image("file:tank-assets/PNG/Environment/dirt.png"));
                     imageView.setX(j* getPixel());
                     imageView.setY(i* getPixel());
                     getChildren().add(imageView);
                    obstacle = new Obstacle(j* getPixel(),i* getPixel(),false,false,"Green");
                    getChildren().add(obstacle);
                }
                else if (mapArray[i][j]==1){
                     ImageView imageView= new ImageView(new Image("file:tank-assets/PNG/Environment/grass.png"));
                     imageView.setX(j* getPixel());
                     imageView.setY(i* getPixel());
                     getChildren().add(imageView);
                    obstacle = new Obstacle(j* getPixel(),i* getPixel(),false,false,"Red");
                    getChildren().add(obstacle);
                    start=new Position(j,i);
                }
                 else if (mapArray[i][j]==2){
//                     ImageView imageView= new ImageView(new Image("file:tank-assets/PNG/Environment/dirt.png"));
//                     imageView.setX(j* getPixel());
//                     imageView.setY(i* getPixel());
//                     getChildren().add(imageView);
                     start=new Position(j,i);
                 }
            }
        }
    }


    public int getSize() {
        return size;
    }

    public double getPixel() {
        return pixel;
    }

    public Position getStart() {
        return start;
    }
    public int getValueAt(int i, int j){

        return mapArray[i][j];
    }
}

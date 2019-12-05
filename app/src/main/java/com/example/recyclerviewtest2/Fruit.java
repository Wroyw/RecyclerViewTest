package com.example.recyclerviewtest2;

public class Fruit {
    private int imageId;
    private String name;

    public Fruit(String name,int imagieId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){

        return name;
    }

    public int getImageId(){
        return imageId;
    }
}


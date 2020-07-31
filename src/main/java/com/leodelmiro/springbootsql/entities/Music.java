package com.leodelmiro.springbootsql.entities;

import java.io.Serializable;

public class Music extends Media implements Serializable {
    private static final long serialVersionUID = 1L;

    private String band;

    public Music (){

    }

    public Music(Long id, String name, String image, String band){
        super(id,name,image);
        this.band = band;
    }

    public String getBand(){
        return band;
    }

    public void setBand(String band){
        this.band = band;
    }
}

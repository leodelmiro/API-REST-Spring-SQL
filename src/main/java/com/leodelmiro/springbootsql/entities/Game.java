package com.leodelmiro.springbootsql.entities;

import java.io.Serializable;

public class Game extends Media implements Serializable {
    private static final long serialVersionUID = 1L;

    private Boolean franchise;

    public Game(){

    }

    public Game(Long id, String name, String image, Boolean franchise){
        super(id, name, image);
        this.franchise = franchise;
    }

    public Boolean isFranchise(){
        return franchise;
    }

    public void setFranchise(Boolean franchise){
        this.franchise = franchise;
    }
}

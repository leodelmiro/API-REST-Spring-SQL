package com.leodelmiro.springbootsql.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Movie extends Media implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer runtime;
    private Boolean franchise;

    public Movie() {

    }

    public Movie(Long id, String name, String image, Integer runtime, Boolean franchise) {
        super(id, name, image);
        this.runtime = runtime;
        this.franchise = franchise;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Boolean isFranchise() {
        return franchise;
    }

    public void setFranchise(Boolean franchise) {
        this.franchise = franchise;
    }
}

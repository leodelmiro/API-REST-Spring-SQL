package com.leodelmiro.springbootsql.entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Series extends Media implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer episodes;
    private Integer seasons;

    public Series() {

    }

    public Series(Long id, String name, String image, Integer episodes, Integer seasons) {
        super(id, name, image);
        this.episodes = episodes;
        this.seasons = seasons;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }
}

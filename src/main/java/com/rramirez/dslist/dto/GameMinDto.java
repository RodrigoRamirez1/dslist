package com.rramirez.dslist.dto;


import com.rramirez.dslist.entities.Game;
import com.rramirez.dslist.projection.GameMinProjection;

public class GameMinDto {
    private Long id;

    private String title;

    private Integer gameYear;

    private String imgUrl;

    private String shortDescription;


    public GameMinDto(Game entity){
        id = entity.getId();
        title = entity.getTitle();
        gameYear = entity.getGameYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDto(GameMinProjection projection){
        id = projection.getId();
        title = projection.getTitle();
        gameYear = projection.getGameYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getGameYear() {
        return gameYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}

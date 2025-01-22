package com.rramirez.dslist.dto;


import com.rramirez.dslist.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
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
}

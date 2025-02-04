package com.rramirez.dslist.controllers;

import com.rramirez.dslist.dto.GameListDto;
import com.rramirez.dslist.dto.GameMinDto;
import com.rramirez.dslist.entities.GameList;
import com.rramirez.dslist.services.GameListService;
import com.rramirez.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findGames(@PathVariable Long listId) {
        List<GameMinDto> result = gameService.findByGameList(listId);
        return result;
    }
}

package com.rramirez.dslist.services;

import com.rramirez.dslist.dto.GameMinDto;
import com.rramirez.dslist.entities.Game;
import com.rramirez.dslist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //@Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }
}

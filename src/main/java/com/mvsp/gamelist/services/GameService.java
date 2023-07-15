package com.mvsp.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvsp.gamelist.DTO.GameMinDTO;
import com.mvsp.gamelist.entities.Game;
import com.mvsp.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		 
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}

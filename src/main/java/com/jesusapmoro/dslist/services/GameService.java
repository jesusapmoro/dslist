package com.jesusapmoro.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesusapmoro.dslist.dto.GameMinDTO;
import com.jesusapmoro.dslist.entities.Game;
import com.jesusapmoro.dslist.repositories.GameRepository;

//registrar ele no sistema
@Service
public class GameService {
	
	//injetar o repository
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}

package com.jesusapmoro.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jesusapmoro.dslist.dto.GameListDTO;
import com.jesusapmoro.dslist.entities.GameList;
import com.jesusapmoro.dslist.repositories.GameListRepository;

//registrar ele no sistema
@Service
public class GameListService {
	
	//injetar o repository
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}

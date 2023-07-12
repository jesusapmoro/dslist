package com.jesusapmoro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jesusapmoro.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

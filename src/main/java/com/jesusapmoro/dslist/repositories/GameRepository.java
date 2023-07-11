package com.jesusapmoro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jesusapmoro.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

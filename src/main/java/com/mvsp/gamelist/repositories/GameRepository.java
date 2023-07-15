package com.mvsp.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvsp.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

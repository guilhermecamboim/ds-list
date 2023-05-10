package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Serve para fazer operações no banco de dados.
public interface GameRepository extends JpaRepository<Game, Long> {
}

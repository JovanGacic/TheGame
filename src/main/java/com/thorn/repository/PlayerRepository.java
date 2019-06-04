package com.thorn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thorn.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}

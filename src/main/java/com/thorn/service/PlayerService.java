package com.thorn.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thorn.model.Player;
import com.thorn.repository.PlayerRepository;

@Service
public class PlayerService implements IPlayerService {

	@Autowired
	private PlayerRepository playerRespository;

	@Override
	public List<Player> findAll() {
		List<Player> players = new ArrayList<>();
		playerRespository.findAll().forEach(players::add);
		return players;
	}
}

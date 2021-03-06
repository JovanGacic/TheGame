package com.thorn.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thorn.model.Player;
import com.thorn.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping("/players")
	public List<Player> getAllPlayers() {
		return playerService.findAll();
	}

	@PostMapping("/add")
	public void addPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);
	}
}

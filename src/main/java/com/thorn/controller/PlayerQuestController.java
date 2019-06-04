package com.thorn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thorn.model.PlayerQuest;
import com.thorn.service.PlayerQuestService;

@RestController
public class PlayerQuestController {
	
	@Autowired
	private PlayerQuestService playerQuestService;
	
	@GetMapping("/playersquests")
	public List<PlayerQuest> getAllPlayersQuests(){
		return playerQuestService.findAll();
	}
	
	@GetMapping("/questsbyplayer")
	private List<PlayerQuest> getQuestsByPlayer(@RequestParam Long playerId){
		return playerQuestService.findByPlayerQuestIdentityPlayerId(playerId);
	}
	
	@GetMapping("/playersbyquest")
	private List<PlayerQuest> getPlayersByQuest(@RequestParam Long questId){
		return playerQuestService.findByPlayerQuestIdentityQuestId(questId);
	}
}

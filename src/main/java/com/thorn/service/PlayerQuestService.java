package com.thorn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thorn.model.PlayerQuest;
import com.thorn.model.PlayerQuestIdentity;
import com.thorn.repository.PlayerQuestRepository;

@Service
public class PlayerQuestService implements IPlayerQuestService {

	@Autowired
	private PlayerQuestRepository playerQuestRepository;

	@Override
	public List<PlayerQuest> findAll() {
		List<PlayerQuest> playerQuest = new ArrayList<>();
		playerQuestRepository.findAll().forEach(playerQuest::add);
		return playerQuest;
	}

	@Override
	public List<PlayerQuest> findByPlayerQuestIdentityPlayerId(Long playerId) {
		List<PlayerQuest> playerQuests = new ArrayList<>();
		playerQuestRepository.findByPlayerQuestIdentityPlayerId(playerId).forEach(playerQuests::add);
		return playerQuests;
	}
	
	@Override
	public List<PlayerQuest> findByPlayerQuestIdentityQuestId(Long questId) {
		List<PlayerQuest> playerQuests = new ArrayList<>();
		playerQuestRepository.findByPlayerQuestIdentityQuestId(questId).forEach(playerQuests::add);
		return playerQuests;
	}
	
	public void addPlayerQuest(Long playerId, Long questId) {
	PlayerQuest playerQuest = new PlayerQuest(new PlayerQuestIdentity(playerId, questId),0L);
	playerQuestRepository.save(playerQuest);
	}
	
	public void updatePlayerQuest(Long playerId, Long questId) {
		PlayerQuestIdentity pqId = new PlayerQuestIdentity(playerId, questId); 
		PlayerQuest pq = playerQuestRepository.findById(pqId)
				.orElseThrow(() -> new EntityNotFoundException("No row found"));
		pq.setQuestStatus(1L);
		playerQuestRepository.save(pq);
	}

}

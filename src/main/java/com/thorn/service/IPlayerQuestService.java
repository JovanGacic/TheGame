package com.thorn.service;

import java.util.List;
import com.thorn.model.PlayerQuest;
import com.thorn.model.PlayerQuestIdentity;

public interface IPlayerQuestService {
	
	List<PlayerQuest> findAll();

	List<PlayerQuest> findByPlayerQuestIdentityPlayerId(Long playerId);
	
	List<PlayerQuest> findByPlayerQuestIdentityQuestId(Long questId);
}

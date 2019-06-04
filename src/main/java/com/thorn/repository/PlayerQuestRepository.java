package com.thorn.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thorn.model.PlayerQuest;
import com.thorn.model.PlayerQuestIdentity;

@Repository
public interface PlayerQuestRepository extends CrudRepository<PlayerQuest, PlayerQuestIdentity> {

	List<PlayerQuest> findByPlayerQuestIdentityPlayerId(Long playerId);
	
	List<PlayerQuest> findByPlayerQuestIdentityQuestId(Long questId);
	
}

package com.thorn.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "playerquests")
public class PlayerQuest {
	
	@EmbeddedId
	private PlayerQuestIdentity playerQuestIdentity;
	@NotNull
	private Long questStatus;
	
	public PlayerQuest() {}

	public PlayerQuest(PlayerQuestIdentity playerQuestIdentity, @NotNull Long questStatus) {
		super();
		this.playerQuestIdentity = playerQuestIdentity;
		this.questStatus = questStatus;
	}

	public PlayerQuestIdentity getPlayerQuestIdentity() {
		return playerQuestIdentity;
	}

	public void setPlayerQuestIdentity(PlayerQuestIdentity playerQuestIdentity) {
		this.playerQuestIdentity = playerQuestIdentity;
	}

	public Long getQuestStatus() {
		return questStatus;
	}

	public void setQuestStatus(Long questStatus) {
		this.questStatus = questStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerQuestIdentity == null) ? 0 : playerQuestIdentity.hashCode());
		result = prime * result + ((questStatus == null) ? 0 : questStatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayerQuest other = (PlayerQuest) obj;
		if (playerQuestIdentity == null) {
			if (other.playerQuestIdentity != null)
				return false;
		} else if (!playerQuestIdentity.equals(other.playerQuestIdentity))
			return false;
		if (questStatus == null) {
			if (other.questStatus != null)
				return false;
		} else if (!questStatus.equals(other.questStatus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayerQuest [playerQuestIdentity=" + playerQuestIdentity + ", questStatus=" + questStatus + "]";
	}

}

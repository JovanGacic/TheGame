package com.thorn.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class PlayerQuestIdentity implements Serializable {

	@NotNull
	@Size(max = 10)
	private Long playerId;
	@NotNull
	@Size(max = 10)
	private Long questId;
	
	public PlayerQuestIdentity() {}
	
	public PlayerQuestIdentity(@NotNull @Size(max = 10) Long playerId, @NotNull @Size(max = 10) Long questId) {
		super();
		this.playerId = playerId;
		this.questId = questId;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public Long getQuestId() {
		return questId;
	}
	public void setQuestId(Long questId) {
		this.questId = questId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((questId == null) ? 0 : questId.hashCode());
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
		PlayerQuestIdentity other = (PlayerQuestIdentity) obj;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (questId == null) {
			if (other.questId != null)
				return false;
		} else if (!questId.equals(other.questId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayerQuestIdentity [playerId=" + playerId + ", questId=" + questId + "]";
	}
	
}

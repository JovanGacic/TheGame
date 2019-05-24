package com.thorn.repository;

import com.thorn.model.Quest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestRepository extends CrudRepository<Quest, Long> {
	
}


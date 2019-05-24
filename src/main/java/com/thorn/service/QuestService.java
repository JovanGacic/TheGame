package com.thorn.service;

import com.thorn.model.Quest;
import com.thorn.repository.QuestRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestService implements IQuestService {

	    @Autowired
	    private QuestRepository questRepository;

	    @Override
	    public List<Quest> findAll() {
	    	List<Quest> quests = new ArrayList<>();
	    	questRepository.findAll().forEach(quests::add);
	    	return quests;
	    }
	
}

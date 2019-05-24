package com.thorn.controller;

import com.thorn.model.Quest;
import com.thorn.service.IQuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestController {

	    @Autowired
	    private IQuestService questService;

	    @GetMapping("/quests")
	    public List<Quest> findQuests() {
	    	return questService.findAll();
	    }
}

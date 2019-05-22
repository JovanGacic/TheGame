package com.thorn.controller;

import com.thorn.model.Question;
import com.thorn.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan({"com.thorn"})
public class QuestionController {

	    @Autowired
	    private IQuestionService questionService;

	    @GetMapping("/findQuestions")
	    public List<Question> findQuestions() {
	    	return questionService.findAll();
	    }
}

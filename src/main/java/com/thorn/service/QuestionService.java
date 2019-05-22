package com.thorn.service;

import com.thorn.model.Question;
import com.thorn.repository.QuestionRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService implements IQuestionService {

	    @Autowired
	    private QuestionRepository questionRepository;

	    @Override
	    public List<Question> findAll() {
	    	List<Question> questions = new ArrayList<>();
	    	questionRepository.findAll().forEach(questions::add);
	    	return questions;
	    }
	
}

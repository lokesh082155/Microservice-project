package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.quizdao;
import com.example.demo.entity.quizentity;

@Service
public class quizservice implements quizinterface {

	@Autowired
	private quizdao questiondao;

	@Autowired
	private QuestionClient questionClient;

	@Override
	public quizentity create(quizentity quizentity) {
		return questiondao.save(quizentity);
	}

	@Override
	public List<quizentity> get() {
		List<quizentity> findAll = questiondao.findAll();
		List<quizentity> collect = findAll.stream().map(i -> {
			i.setQuestions(questionClient.getQuestionentities(i.getQuizid()));
			return i;
		}).collect(Collectors.toList());
		return collect;
	}

	@Override
	public quizentity getone(Long quizid) {
		Optional<quizentity> findById = questiondao.findById(quizid);
		quizentity quizentity = findById.get();
		System.err.println(quizid + "loki");
		quizentity.setQuestions(questionClient.getQuestionentities(quizid));
		return quizentity;
	}

}

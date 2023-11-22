package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.quizentity;

public interface quizinterface {

	quizentity create(quizentity quizentity);

	List<quizentity> get();

	quizentity getone(Long quizid);

}

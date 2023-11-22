package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.quizentity;
import com.example.demo.service.quizinterface;

@RestController
public class quizcontroller {

	@Autowired
	private quizinterface questioninterface;

	@PostMapping("/post")
	public quizentity create(@RequestBody quizentity questionentity) {
		return questioninterface.create(questionentity);
	}

	@GetMapping("/quizall")
	public List<quizentity> getall() {
		return questioninterface.get();
	}

	@GetMapping("/quizid/{questionid}")
	public quizentity getbyid(@PathVariable Long questionid) {
	    return questioninterface.getone(questionid);
	}
}

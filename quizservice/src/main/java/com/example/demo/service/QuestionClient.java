package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Question;

@FeignClient(name = "Question-service", value = "Question-service")
public interface QuestionClient {
	@GetMapping("/quizid/{quizid}")
	List<Question> getQuestionentities(@PathVariable Long quizid);
}

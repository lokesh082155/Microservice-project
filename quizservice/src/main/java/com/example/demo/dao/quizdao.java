package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.quizentity;


public interface quizdao extends JpaRepository<quizentity, Long> {

}

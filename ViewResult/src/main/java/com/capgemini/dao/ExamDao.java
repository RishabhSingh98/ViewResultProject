package com.capgemini.dao;

import java.util.List;

import com.capgemini.entity.Exam;
import com.capgemini.entity.ExamResult;
import com.capgemini.entity.User;
import com.capgemini.exception.ExamException;
import com.capgemini.exception.IdException;

public interface ExamDao {
	public Exam getExam(int testId) throws ExamException;

	public User getUser(String userId) throws ExamException;
	
	public List<ExamResult> getExamResults(String userId) ;
		
}

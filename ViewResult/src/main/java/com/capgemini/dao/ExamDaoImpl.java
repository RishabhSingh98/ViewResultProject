package com.capgemini.dao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.capgemini.entity.Exam;
import com.capgemini.entity.ExamResult;
import com.capgemini.entity.User;
import com.capgemini.exception.ExamException;
import com.capgemini.exception.IdException;
import com.capgemini.repositary.ExamRepo;

public class ExamDaoImpl implements ExamDao{
	Map<String, ExamResult> examResults = ExamRepo.examResults;
	@Override
	public Exam getExam(int testId) throws ExamException {
		if(!ExamRepo.exammap.containsKey(testId))
			throw new ExamException("Enter valid testId");
		return ExamRepo.exammap.get(testId);
	}

	@Override
	public User getUser(String userId) throws ExamException{
		if(!ExamRepo.exammap.containsKey(userId))
			throw new ExamException("Enter valid userId");
		
		return ExamRepo.usermap.get(userId);
	}

	@Override
	public List<ExamResult> getExamResults(String userId){
		
		
		List<ExamResult> lst = examResults.values().stream()
				.filter(e -> e.getUser().getUserId().equals(userId)).collect(Collectors.toList());
		


		return lst;
	}


}

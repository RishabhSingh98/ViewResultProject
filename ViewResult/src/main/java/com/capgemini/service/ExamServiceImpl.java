package com.capgemini.service;

import java.util.List;
import java.util.Map;

import com.capgemini.entity.ExamResult;
import com.capgemini.dao.ExamDao;
import com.capgemini.dao.ExamDaoImpl;
import com.capgemini.entity.Exam;
import com.capgemini.entity.User;
import com.capgemini.exception.ExamException;
import com.capgemini.exception.IdException;
import com.capgemini.exception.ValidationException;

public class ExamServiceImpl implements ExamService{
	ExamDao dao = new ExamDaoImpl();
	
	

	@Override
	public List<ExamResult> ExamResult(String uid) throws ExamException {
		
		
	   return dao.getExamResults(uid);
		 
		
	}
	
	public boolean validateUID(String uid) throws ValidationException {
		if(!uid.matches("^[0-9]{4}$"))
			throw new ValidationException("User Id should be exactly four digit");
		if(!uid.isEmpty() || uid!=null)
			throw new ValidationException( "User iD shoul not be NUll");
		if(uid.matches("^[a-zA-Z]$"))
			throw new ValidationException("User Id should not be alphabet");
		
		return true;
	}

}

package com.capgemini.dao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.capgemini.entity.Exam;
import com.capgemini.entity.ExamResult;
import com.capgemini.entity.User;
import com.capgemini.exception.ExamException;
import com.capgemini.repositary.ExamRepo;

/***************************************************************
 * @author Rishabh Singh
 * @description: Implements the ExamDao methods 
 ***************************************************************/
public class ExamDaoImpl implements ExamDao{
	
/***************************************************************
 * @description: Creating the Map in which we are getting
 * key as String and value as ExamResult type. Its reference i.e.
 * examResults get the test values from ExamRepo class
 ***************************************************************/	
	Map<String, ExamResult> examResults = ExamRepo.examResults;
	
	/***************************************************************
	 * @description: To get a Exam Detail
	 * @method: getExam()
	 * @returnType: Exam
	 * @parameter1: testId 
	 * @Throws: ExamException
	 ***************************************************************/
	@Override
	public Exam getExam(int testId) throws ExamException {
		if(!ExamRepo.exammap.containsKey(testId))
			throw new ExamException("Enter valid testId");
		return ExamRepo.exammap.get(testId);
	}
	
	/***************************************************************
	 * @description: To get a user detail 
	 * @method: getUser()
	 * @returnType: User 
	 * @parameter1: userId 
	 * @Throws: ExamException
	 ***************************************************************/
	@Override
	public User getUser(String userId) throws ExamException{
		if(!ExamRepo.usermap.containsKey(userId))
			throw new ExamException("Enter valid userId");
		
		return ExamRepo.usermap.get(userId);
	}
	
	/***************************************************************
	 * @description: To get Exam Result in this specific method
	 * @method: getExamResults()
	 * @returnType: List 
	 * @parameter1: userId
	 ***************************************************************/
	@Override
	public List<ExamResult> getExamResults(String userId){
		
		
		List<ExamResult> lst = examResults.values().stream()
				.filter(e -> e.getUser().getUserId().equals(userId)).collect(Collectors.toList());
		


		return lst;
	}


}

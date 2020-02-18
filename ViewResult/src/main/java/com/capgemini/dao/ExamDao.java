package com.capgemini.dao;

import java.util.List;

import com.capgemini.entity.Exam;
import com.capgemini.entity.ExamResult;
import com.capgemini.entity.User;
import com.capgemini.exception.ExamException;

/****************************************************************
 * @author Rishabh Singh
 * @description: Creating the Interface i.e.ExamDao and
 * it provide the Methods for the implementations and
 * this class fetch the information from repository and
 * provide support to the service
 * @Methods: getExam(),getUser() and getExamResults()
 * @return :  User,List and Exam
 * @throws : ExamException
 * @param1: testId in getTest() method
 * @param2: userId in getUser method
 * @param3: userId in getExamResults() method
 ***************************************************************/
public interface ExamDao {
	public Exam getExam(int testId) throws ExamException;

	public User getUser(String userId) throws ExamException;

	public List<ExamResult> getExamResults(String userId);

}

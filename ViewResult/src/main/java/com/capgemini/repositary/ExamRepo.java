package com.capgemini.repositary;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.entity.Exam;
import com.capgemini.entity.ExamResult;
import com.capgemini.entity.User;

/***************************************************************
 * @author : Rishabh Singh
 * @description: Creating the repository class
 ***************************************************************/
public class ExamRepo {
	/********************************************************************************************
	 * @description: Creating a Map for Exam in which
	 * it is getting key as a Integer,String and value as an Exam,User and ExamResult instances
	 *********************************************************************************************/
	public static Map<Integer, Exam> exammap = new HashMap<>();
	public static Map<Integer, User> usermap = new HashMap<>();
	public static Map<String, ExamResult> examResults = new HashMap<>();
	static {
		/************************************************************************************** 
		 * @description: Adding Subject at a particular examId  and put into the map reference
		 **************************************************************************************/
		Exam e1 = new Exam(1, "Java");
		Exam e2 = new Exam(2, "c++");
		exammap.put(e1.getExamId(), e1);
		exammap.put(e2.getExamId(), e2);
		
		/******************************************************************************************* 
		 * @description: Adding user detail at a particular userId  and put into the map reference
		 *******************************************************************************************/
		User u1 = new User("1001", "Hari", "H@123");
		usermap.put(1001,u1 );
		User u2 = new User("1002", "Mohan", "M@123");
		usermap.put(1002, u2);
		
		
		/**************************************************************************************** 
		 * @description: Adding ExamReult at a particular userId  and put into the map reference
		 ****************************************************************************************/
		ExamResult er1 = new ExamResult(e1,u1,50 );
		ExamResult er2 = new ExamResult(e2,u2,70); 
        examResults.put(u1.getUserId(), er1);
        examResults.put(u2.getUserId(), er2);

	}

}

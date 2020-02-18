package com.capgemini.repositary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.entity.Exam;
import com.capgemini.entity.ExamResult;
import com.capgemini.entity.User;

public class ExamRepo {
	public static Map<Integer, Exam> exammap = new HashMap<>();
	public static Map<Integer, User> usermap = new HashMap<>();
	public static Map<String, ExamResult> examResults = new HashMap<>();
	static {
		Exam e1 = new Exam(1, "Java");
		Exam e2 = new Exam(2, "c++");
	
		exammap.put(e1.getExamId(), e1);
		exammap.put(e2.getExamId(), e2);
		
		User u1 = new User("1001", "Hari", "H@123");
		usermap.put(1001,u1 );
		User u2 = new User("1002", "Mohan", "M@123");
		usermap.put(1002, u2);
		
		
		ExamResult er1 = new ExamResult(e1,u1,50 );
		ExamResult er2 = new ExamResult(e2,u2,70); 
        examResults.put(u1.getUserId(), er1);
        examResults.put(u2.getUserId(), er2);

	}

}

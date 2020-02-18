package com.capgemini.Client;

import java.util.Scanner;

import com.capgemini.exception.ExamException;
import com.capgemini.exception.IdException;
import com.capgemini.exception.ValidationException;
import com.capgemini.service.ExamService;
import com.capgemini.service.ExamServiceImpl;

public class ExamClient {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user id");
		ExamService ser = new ExamServiceImpl();
		
		String id = scan.next();
		try {
			System.out.println(ser.ExamResult(id));
		} catch (ExamException | IdException | ValidationException ex) {
			System.err.println(ex.getMessage());
		}
		
		

	}

}

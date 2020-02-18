package com.capgemini.entity;

/*************************************************************
 * @author Rishabh Singh 
 * @description: Creating a Exam class
 *************************************************************/
public class Exam {
	
	/**********************************************************
	 * @description: provide the fields of Exam class
	 **********************************************************/
	private int examId;
	private String examname;
	
	/**********************************************************
	 * @description: provide the constructor using fields
	 **********************************************************/
	public Exam(int examId, String examname) {
		super();
		this.examId = examId;
		this.examname = examname;
	}
	
	/**********************************************************
	 * @description: provide the no-argument constructor 
	 **********************************************************/
	public Exam() {
		super();
	}
	
	/**********************************************************
	 * @description: provide the getters and setters using all
	 * the fields of Exam class
	 **********************************************************/
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	
	/**********************************************************
	 * @description: Override toString() using fields 
	 **********************************************************/
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examname=" + examname + "]";
	}
	
	}
	

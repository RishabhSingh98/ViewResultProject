package com.capgemini.entity;

/*************************************************************
 * @author  Singh 
 * @description: Creating a Exam Result class
 *************************************************************/
public class ExamResult {
	
	/**********************************************************
	 * @description: provide the fields for ExamResult class
	 **********************************************************/
	private Exam exam;
	private User user;
	private int marks ;
	
	/**********************************************************
	 * @description: provide the no-argument constructor
	 **********************************************************/
	 public ExamResult( ) {
		super();
		
	 }
	 
	 /**********************************************************
		 * @description: provide the constructor using fields
		 **********************************************************/
	public ExamResult(Exam exam, User user, int marks) {
		super();
		this.exam = exam;
		this.user = user;
		this.marks = marks;
	}

	/**********************************************************
	 * @description: provide the getters and setters using all
	 * the fields of ExamResult class
	 **********************************************************/
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	/**********************************************************
	 * @description: Override toString() using fields
	 **********************************************************/
	@Override
	public String toString() {
		return "ExamResult [exam=" + exam + ", user=" + user + ", marks=" + marks + "]";
	}


   
	
}

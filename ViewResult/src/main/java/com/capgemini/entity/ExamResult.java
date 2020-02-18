package com.capgemini.entity;

public class ExamResult {
	
	private Exam exam;
	private User user;
	private int marks ;
	 public ExamResult( ) {
		super();
		
	 }
	 
	 
	public ExamResult(Exam exam, User user, int marks) {
		super();
		this.exam = exam;
		this.user = user;
		this.marks = marks;
	}


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


	@Override
	public String toString() {
		return "ExamResult [exam=" + exam + ", user=" + user + ", marks=" + marks + "]";
	}


   
	
}

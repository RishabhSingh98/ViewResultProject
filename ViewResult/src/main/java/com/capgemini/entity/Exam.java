package com.capgemini.entity;

public class Exam {
	private int examId;
	private String examname;
	public Exam(int examId, String examname) {
		super();
		this.examId = examId;
		this.examname = examname;
	}
	public Exam() {
		super();
	}
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
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examname=" + examname + "]";
	}
	
	}
	

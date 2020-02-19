package com.capgemini.exam.ViewResult;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.exception.ExamException;
import com.capgemini.exception.ValidationException;
import com.capgemini.service.ExamService;
import com.capgemini.service.ExamServiceImpl;

public class TestResult {

	ExamService ser = new ExamServiceImpl();

	// @Test
	// @DisplayName(" Test Case 1")
	// public void testExamResult1() throws IdException{
	// assertEquals(s);
	// }

	@Test
	@DisplayName(" Test Validation if userID > 4")
	public void testExamResult2() throws ValidationException {
		assertThrows(ValidationException.class, () -> ser.ExamResult("1234567").toString());
	}
	@Test
	@DisplayName(" Test Validation  if userID is null ")
	public void testExamResult3() throws ValidationException {
		assertThrows(ValidationException.class, () -> ser.ExamResult("").toString());
	}
	@Test
	@DisplayName(" Test Validation  if userID is alphabet ")
	public void testExamResult4() throws ValidationException {
		assertThrows(ValidationException.class, () -> ser.ExamResult("abcd").toString());
	}
//	@Test
//	@DisplayName(" Test Exam Exception  if Test ID is not valid ")
//		public void testExamResult5() throws ExamException {
//			assertEquals(ser);
//		}
	
}

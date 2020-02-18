package com.capgemini.service;
import com.capgemini.entity.ExamResult;

import java.util.List;

import com.capgemini.exception.ExamException;
import com.capgemini.exception.IdException;
import com.capgemini.exception.ValidationException;

public interface ExamService {
	/***************************************************************
	 * @author Rishabh Singh
	 * @description: provide the Method to for its implementation.
	 *  and getting support from the Dao Layer
	 *  @Method: ExamResult() and ValidateUID
	 *  @return : boolean and List
	 *  @throws : IDException, ValidationException, IdException
	 *  @param1: uid
	 ***************************************************************/
	public List<ExamResult> ExamResult(String uid) throws ExamException, IdException, ValidationException;
	public boolean validateUID(String uid) throws ValidationException, ExamException, IdException;
}


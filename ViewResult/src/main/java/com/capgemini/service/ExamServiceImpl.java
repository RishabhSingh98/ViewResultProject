package com.capgemini.service;

import java.util.List;

import com.capgemini.dao.ExamDao;
import com.capgemini.dao.ExamDaoImpl;
import com.capgemini.entity.ExamResult;
import com.capgemini.exception.ExamException;
import com.capgemini.exception.IdException;
import com.capgemini.exception.ValidationException;


/***************************************************************
 * @author Rishabh Singh
 * 
 * @description: Implements the ExamService method 
 * 
 ***************************************************************/
public class ExamServiceImpl implements ExamService {
	ExamDao dao = new ExamDaoImpl();
	
	/************************************************************************************
	 * @description: This method is for exam result when we pass uid it will fetch the
	 * all data of user at a particular that id
	 * @Method: ExamResult()
	 * @return : List
	 * @throws : IDException, ValidationException,ExamException
	 * @param1: uid
	 *************************************************************************************/

	@Override
	public List<ExamResult> ExamResult(String uid) throws ExamException, IdException, ValidationException {
		List<ExamResult> examResults = null;
		if (validateUID(uid)) {
			examResults = dao.getExamResults(uid);
			if (examResults.isEmpty())
				throw new ExamException("No Results Found!.");

		}

		return examResults;

	}
	
	/************************************************************************************
	 * @description: This method is for checking the validation of the user id 
	 * @Method: validateUID()
	 * @return : boolean
	 * @throws : IDException, ValidationException, ExamException
	 * @param1: uid
	 *************************************************************************************/

	
	public boolean validateUID(String uid) throws ValidationException, ExamException, IdException {
		if (!uid.matches("^[0-9]{4}$")) {
			throw new ValidationException("User Id should be exactly four digit");
		} else if (uid.isEmpty() || uid == null) {
			throw new ValidationException("User iD should not be NUll");
		} else if (uid.matches("^[a-zA-Z]$")) {
			throw new ValidationException("User Id should not be alphabet");
		}

		return true;
	}

}

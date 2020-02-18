package com.capgemini.service;
import com.capgemini.entity.ExamResult;
import java.util.List;

import com.capgemini.exception.ExamException;
import com.capgemini.exception.IdException;

public interface ExamService {
	public List<ExamResult> ExamResult(String uid) throws ExamException;

}

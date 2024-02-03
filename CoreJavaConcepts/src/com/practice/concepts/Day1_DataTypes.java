package com.practice.concepts;

import com.practice.customexceptions.BaseException;
import com.practice.customexceptions.ErrorCodeConstant;
import com.practice.customexceptions.ExceptionCode;
import com.practice.customexceptions.MyCustomException;

public class Day1_DataTypes {
	
	public static void main(String[] args) throws MyCustomException {
		
		
		throw new MyCustomException(ExceptionCode.ACTIVE_USER_FOUND);
		
	}

}

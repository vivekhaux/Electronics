package com.electronics.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.electronics.exceptions.NameException;

@RestControllerAdvice

//Using with Name Exception
public class globalException {
	@ExceptionHandler(NameException.class)
	public ResponseEntity<String> nameHandling(NameException ne) {
		return new ResponseEntity<>("name not found",HttpStatus.NOT_FOUND);
	}

}

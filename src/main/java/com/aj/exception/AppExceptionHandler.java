package com.aj.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice()
public class AppExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		String exMsg = e.getMessage();
		
		ErrorInfo info = new ErrorInfo();
		info.setCode("1235");
		info.setMsg(exMsg);
		info.setWhen(LocalDate.now());
		
		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handlieUserNFE(Exception e){
		String exMsg = e.getMessage();
		
		ErrorInfo info = new ErrorInfo();
		info.setCode("001");
		info.setMsg(exMsg);
		info.setWhen(LocalDate.now());
		
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}

}
  
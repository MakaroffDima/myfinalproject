package com.mygroup.myfinalproject.exception;

import com.mygroup.myfinalproject.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException exception) {
        return new ResponseEntity<>(new ErrorResponse(exception.getCode(), exception.getDescription()), HttpStatus.NO_CONTENT);
    }
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorResponse> handleNotEnoughMoneyException(NotEnoughMoneyException exception) {
        return new ResponseEntity<>(new ErrorResponse(exception.getCode(), exception.getDescription()), HttpStatus.BAD_REQUEST);
    }
}

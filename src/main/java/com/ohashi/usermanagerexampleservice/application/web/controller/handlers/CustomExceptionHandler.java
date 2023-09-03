package com.ohashi.usermanagerexampleservice.application.web.controller.handlers;

import com.ohashi.usermanagerexampleservice.application.web.controller.handlers.exceptions.ApiErrorMessage;
import com.ohashi.usermanagerexampleservice.domain.exception.UserAlreadyExistsException;
import org.apache.coyote.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorMessage> handleGenericException(UserAlreadyExistsException exception, WebRequest request) {
        var apiErrorMessage = new ApiErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return new ResponseEntity<>(apiErrorMessage, new HttpHeaders(), apiErrorMessage.getStatus());
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ApiErrorMessage> handleUserAlreadyExistsException(UserAlreadyExistsException exception, WebRequest request) {
        var apiErrorMessage = new ApiErrorMessage(HttpStatus.CONFLICT, exception.getMessage());
        return new ResponseEntity<>(apiErrorMessage, new HttpHeaders(), apiErrorMessage.getStatus());
    }
}

package com.ohashi.usermanagerexampleservice.application.web.controller.handlers.exceptions;

import org.springframework.http.HttpStatus;

public class ApiErrorMessage {

    private final HttpStatus status;
    private final String error;

    public ApiErrorMessage(HttpStatus status, String error) {
        super();
        this.status = status;
        this.error = error;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }
}

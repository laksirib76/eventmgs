package com.ems.ems_backend.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
//@ResponseStatus(value = HttpStatus.NOT_FOUND)
@ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

}

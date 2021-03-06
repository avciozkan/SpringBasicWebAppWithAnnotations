package com.avci.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException () {
        super();
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

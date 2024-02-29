package com.mygroup.myfinalproject.exception;

import lombok.Data;

@Data
public class NotFoundException extends RuntimeException {
    private final int code;
    private final String description;

    public NotFoundException(int code, String description) {
        super(description);
        this.code = code;
        this.description = description;
    }
}

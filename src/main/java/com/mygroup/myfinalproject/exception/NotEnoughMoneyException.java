package com.mygroup.myfinalproject.exception;

import lombok.Data;

@Data
public class NotEnoughMoneyException extends RuntimeException {
    private final int code;
    private final String description;

    public NotEnoughMoneyException(int code, String description) {
        super(description);
        this.code = code;
        this.description = description;
    }
}

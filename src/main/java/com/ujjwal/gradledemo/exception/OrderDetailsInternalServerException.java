package com.ujjwal.gradledemo.exception;

public class OrderDetailsInternalServerException extends RuntimeException{
    public String exceptionMessage;

    public OrderDetailsInternalServerException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}

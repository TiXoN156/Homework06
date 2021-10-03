package com.company;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
    public MyArrayDataException(String message) {
        super(message);
    }
}

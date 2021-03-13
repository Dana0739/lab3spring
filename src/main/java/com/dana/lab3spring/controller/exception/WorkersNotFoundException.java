package com.dana.lab3spring.controller.exception;

public class WorkersNotFoundException extends RuntimeException {
    public WorkersNotFoundException() {
        super("Could not find workers");
    }
}

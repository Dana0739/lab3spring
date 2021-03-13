package com.dana.lab3spring.controller.exception;

public class OrganizationFailedDependencyException extends RuntimeException {
    public OrganizationFailedDependencyException() {
        super("Could not fire unemployed worker");
    }
}

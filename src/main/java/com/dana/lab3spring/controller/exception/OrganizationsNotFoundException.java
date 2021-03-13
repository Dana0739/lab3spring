package com.dana.lab3spring.controller.exception;

public class OrganizationsNotFoundException extends RuntimeException {
    public OrganizationsNotFoundException() {
        super("Could not find organizations");
    }
}

package com.dana.lab3spring.controller.exception;

public class OrganizationNotFoundException extends RuntimeException {
    public OrganizationNotFoundException(Long id) {
        super("Could not find organization with id " + id);
    }
}

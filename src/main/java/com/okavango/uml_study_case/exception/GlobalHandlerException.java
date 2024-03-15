package com.okavango.uml_study_case.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ExceptionObject> noSuchElementException(NoSuchElementException e, HttpServletRequest request) {

        String uri = request.getRequestURI();
        int initialContent = uri.lastIndexOf("/");
        String id = uri.substring(initialContent + 1);

        String message = "Resource with id = '" + id + "' Not Found";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ExceptionObject(request.getRequestURI(),
                        LocalDateTime.now(),
                        request.getMethod(),
                        HttpStatus.NOT_FOUND.value(),
                        message));
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<ExceptionObject> noResourceFoundException(NoResourceFoundException e, HttpServletRequest request) {
        String message = "Check for any possible errors in the URL";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ExceptionObject(request.getRequestURI(),
                        LocalDateTime.now(),
                        request.getMethod(),
                        HttpStatus.NOT_FOUND.value(),
                        message));
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ExceptionObject> methodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e, HttpServletRequest request) {
        String message = "Check for any possible errors in the URL";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                new ExceptionObject(request.getRequestURI(),
                        LocalDateTime.now(),
                        request.getMethod(),
                        HttpStatus.BAD_REQUEST.value(),
                        message));
    }


}


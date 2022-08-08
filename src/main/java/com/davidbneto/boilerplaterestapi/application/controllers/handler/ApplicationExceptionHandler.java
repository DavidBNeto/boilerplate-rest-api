package com.davidbneto.boilerplaterestapi.application.controllers.handler;

import static org.springframework.http.ResponseEntity.notFound;

import com.davidbneto.boilerplaterestapi.application.controllers.exceptions.ObjectNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {

  @ExceptionHandler(ObjectNotFoundException.class)
  public ResponseEntity<String> handleMissingRequestHeaderParameters(final ObjectNotFoundException exception) {
    return notFound().build();
  }
}

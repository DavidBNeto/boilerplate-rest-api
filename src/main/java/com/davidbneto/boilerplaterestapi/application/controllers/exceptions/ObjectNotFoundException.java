package com.davidbneto.boilerplaterestapi.application.controllers.exceptions;

public class ObjectNotFoundException extends RuntimeException{

  private final String uuid;

  public ObjectNotFoundException(final String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }
}

package com.davidbneto.boilerplaterestapi.application.util;

public abstract class HttpResponse {

  public static final String CREATED = "Created";
  public static final String BAD_GATEWAY = "Bad Gateway";
  public static final String BAD_REQUEST = "Bad Request";
  public static final String CONFLICT = "Conflict";
  public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
  public static final String NO_CONTENT = "No Content";
  public static final String NOT_FOUND = "Not Found";
  public static final String OK = "Ok";
  public static final String PROXY_AUTHENTICATION_REQUIRED = "Proxy Authentication Required";
  public static final String UNAUTHORIZED = "Unauthorized";
  public static final String UNPROCESSABLE_ENTITY = "Unprocessable Entity";

  public static final String STATUS_CREATED = "201";
  public static final String STATUS_BAD_GATEWAY = "502";
  public static final String STATUS_BAD_REQUEST = "400";
  public static final String STATUS_CONFLICT = "409";
  public static final String STATUS_INTERNAL_SERVER_ERROR = "500";
  public static final String STATUS_NO_CONTENT = "204";
  public static final String STATUS_NOT_FOUND = "404";
  public static final String STATUS_OK = "200";
  public static final String STATUS_PROXY_AUTHENTICATION_REQUIRED = "407";
  public static final String STATUS_UNAUTHORIZED = "401";
  public static final String STATUS_UNPROCESSABLE_ENTITY = "422";

}

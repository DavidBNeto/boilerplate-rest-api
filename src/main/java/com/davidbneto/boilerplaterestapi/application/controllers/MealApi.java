package com.davidbneto.boilerplaterestapi.application.controllers;

import static com.davidbneto.boilerplaterestapi.application.util.OpenApiUtil.MEAL_DESCRIPTION;
import static com.davidbneto.boilerplaterestapi.application.util.OpenApiUtil.UUID_EXAMPLE;
import static io.swagger.v3.oas.annotations.enums.ParameterIn.PATH;

import com.davidbneto.boilerplaterestapi.application.util.HttpResponse;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


public interface MealApi {

  @Operation(summary = "Operation performed to retrieve a card account by uuid",
      responses = {
          @ApiResponse(
              responseCode = HttpResponse.STATUS_OK,
              description = HttpResponse.OK,
              content = @Content(
                  mediaType = MediaType.APPLICATION_JSON_VALUE,
                  schema = @Schema(implementation = Meal.class)
              )),
          @ApiResponse(
              responseCode = HttpResponse.STATUS_UNAUTHORIZED,
              description = HttpResponse.UNAUTHORIZED,
              content = @Content),
          @ApiResponse(
              responseCode = HttpResponse.STATUS_NOT_FOUND,
              description = HttpResponse.NOT_FOUND,
              content = @Content),
          @ApiResponse(
              responseCode = HttpResponse.STATUS_INTERNAL_SERVER_ERROR,
              description = HttpResponse.INTERNAL_SERVER_ERROR,
              content = @Content),
          @ApiResponse(
              responseCode = HttpResponse.STATUS_BAD_GATEWAY,
              description = HttpResponse.BAD_GATEWAY,
              content = @Content)
      })
  ResponseEntity<Meal> getByUuid(
      @Parameter(in = PATH, required = true, description = MEAL_DESCRIPTION, example = UUID_EXAMPLE) final String uuid);



}

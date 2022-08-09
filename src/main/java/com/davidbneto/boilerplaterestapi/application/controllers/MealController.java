package com.davidbneto.boilerplaterestapi.application.controllers;

import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.MealCreationRequest;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.MealPatchRequest;
import com.davidbneto.boilerplaterestapi.domain.service.MealService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meal")
public class MealController implements MealApi{

  private final MealService mealService;

  public MealController(final MealService mealService) {
    this.mealService = mealService;
  }

  @GetMapping(value = "/{uuid}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Meal> getByUuid(@PathVariable final String uuid) {
    return ResponseEntity.ok(mealService.getByUuid(uuid));
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Meal>> getAll(@PathVariable final String uuid) {
    return ResponseEntity.ok(mealService.getAll());
  }

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Meal> create(@RequestBody final MealCreationRequest request) {
    return new ResponseEntity<>(mealService.create(request), HttpStatus.CREATED);
  }

  @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Meal> put(@PathVariable final String uuid, @RequestBody final MealCreationRequest request) {
    return mealService.put(uuid, request);
  }

  @PatchMapping(value = "/{uuid}",produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Meal> patch(@PathVariable final String uuid, @RequestBody final MealPatchRequest request) {
    return ResponseEntity.ok(mealService.patch(uuid, request));
  }
}

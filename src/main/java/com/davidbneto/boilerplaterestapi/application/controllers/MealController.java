package com.davidbneto.boilerplaterestapi.application.controllers;

import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import com.davidbneto.boilerplaterestapi.domain.service.MealService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meal")
public class MealController {

  private final MealService mealService;

  public MealController(final MealService mealService) {
    this.mealService = mealService;
  }

  @GetMapping("/{uuid}")
  public ResponseEntity<Meal> getByUuid(@PathVariable final String uuid) {
    return ResponseEntity.ok(mealService.getByUuid(uuid));
  }

  @GetMapping()
  public ResponseEntity<List<Meal>> getAll(@PathVariable final String uuid) {
    return ResponseEntity.ok(mealService.getAll());
  }

}

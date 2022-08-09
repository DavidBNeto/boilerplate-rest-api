package com.davidbneto.boilerplaterestapi.domain.service;

import com.davidbneto.boilerplaterestapi.application.controllers.exceptions.ObjectNotFoundException;
import com.davidbneto.boilerplaterestapi.domain.data.mapper.MealMapper;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.MealCreationRequest;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.MealPatchRequest;
import com.davidbneto.boilerplaterestapi.domain.repository.MealRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MealService {

  private final MealRepository mealRepository;
  private final MealMapper mealMapper;

  public MealService(final MealRepository mealRepository, final MealMapper mealMapper) {
    this.mealRepository = mealRepository;
    this.mealMapper = mealMapper;
  }

  public Meal getByUuid(final String uuid) {
    Optional<Meal> meal = mealRepository.getByUuid(uuid);
    if (meal.isEmpty()) throw new ObjectNotFoundException(uuid);
    return meal.get();
  }

  public List<Meal> getAll() {
    return mealRepository.getAll();
  }

  public Meal create(final MealCreationRequest request) {
    Optional<Meal> meal = mealRepository.save(mealMapper.mealCreationRequestToMeal(request));
    if (meal.isEmpty()) throw new RuntimeException();
    return meal.get();
  }

  public ResponseEntity<Meal> put(final String uuid, final MealCreationRequest request) {
    Optional<Meal> meal = mealRepository.update(uuid, mealMapper.mealCreationRequestToMeal(request));
    if (meal.isPresent()) {
      return new ResponseEntity<>(
          meal.get(),
          HttpStatus.CREATED
      );
    }
    return new ResponseEntity<>(
        create(request),
        HttpStatus.CREATED
    );
  }

  public Meal patch(final String uuid, final MealPatchRequest request) {
    Optional<Meal> meal = mealRepository.update(uuid, mealMapper.mealPatchRequestToMeal(request));
    if (meal.isEmpty()) throw new ObjectNotFoundException(uuid);
    return meal.get();
  }
}

package com.davidbneto.boilerplaterestapi.domain.service;

import com.davidbneto.boilerplaterestapi.application.controllers.exceptions.ObjectNotFoundException;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import com.davidbneto.boilerplaterestapi.domain.repository.MealRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MealService {

  private final MealRepository mealRepository;

  public MealService(final MealRepository mealRepository) {
    this.mealRepository = mealRepository;
  }

  public Meal getByUuid(final String uuid) {
    Optional<Meal> meal = mealRepository.getByUuid(uuid);
    if (meal.isEmpty()) throw new ObjectNotFoundException(uuid);
    return meal.get();
  }

  public List<Meal> getAll() {
    return mealRepository.getAll();
  }
}

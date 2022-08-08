package com.davidbneto.boilerplaterestapi.domain.repository;

import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import java.util.List;
import java.util.Optional;

public interface MealRepository {

  List<Meal> getAll();

  Optional<Meal> getByUuid(String uuid);

}

package com.davidbneto.boilerplaterestapi.infrastructure.repository;

import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import com.davidbneto.boilerplaterestapi.domain.repository.MealRepository;
import com.davidbneto.boilerplaterestapi.infrastructure.data.mapper.MealMapper;
import com.davidbneto.boilerplaterestapi.infrastructure.repository.persistence.MealMongoRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class MealRepositoryImpl implements MealRepository {

  private final MealMongoRepository mealMongoRepository;
  private final MealMapper mapper;

  public MealRepositoryImpl(final MealMongoRepository mealMongoRepository, final MealMapper mapper) {
    this.mealMongoRepository = mealMongoRepository;
    this.mapper = mapper;
  }

  public List<Meal> getAll() {
    return mealMongoRepository.findAll().stream().map(mapper::mealDocumentToMeal).collect(Collectors.toList());
  }

  public Optional<Meal> getByUuid(final String uuid) {
    return Optional.of(mapper.mealDocumentToMeal(mealMongoRepository.findById(uuid).get()));
  }


}

package com.davidbneto.boilerplaterestapi.infrastructure.repository;

import static java.util.Objects.nonNull;

import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import com.davidbneto.boilerplaterestapi.domain.repository.MealRepository;
import com.davidbneto.boilerplaterestapi.infrastructure.data.MealDocument;
import com.davidbneto.boilerplaterestapi.infrastructure.data.mapper.MealMapper;
import com.davidbneto.boilerplaterestapi.infrastructure.repository.persistence.MealMongoRepository;
import java.util.LinkedList;
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

  public Optional<Meal> save(final Meal meal) {
    return mapper.mealDocumentToMeal(mealMongoRepository.save(mapper.mealToMealDocument(meal)));
  }

  public Optional<Meal> update(final String uuid, final Meal meal) {

  }

  public Optional<Meal> update(final String uuid, final Meal meal) {
    Optional<MealDocument> possibleDoc = mealMongoRepository.findById(uuid);
    if (possibleDoc.isEmpty()) return Optional.empty();
    MealDocument mealDocument = possibleDoc.get();
    if (nonNull(meal.getDishes())) {
      LinkedList<String> dishes = (LinkedList<String>) mealDocument.getDishes();
      dishes.addAll(meal.getDishes());
      mealDocument.setDishes(dishes);
    }
    if (nonNull(meal.getOccasion())) mealDocument.setOccasion(meal.getOccasion());
    if (nonNull(meal.getTime())) mealDocument.setTime(meal.getTime());
    return Optional.of(mapper.mealDocumentToMeal(mealMongoRepository.save(mealDocument)));
  }
}

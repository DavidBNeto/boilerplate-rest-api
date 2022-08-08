package com.davidbneto.boilerplaterestapi.infrastructure.data.mapper;

import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import com.davidbneto.boilerplaterestapi.infrastructure.data.MealDocument;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MealMapper {

  Meal mealDocumentToMeal(MealDocument mealDocument);

  MealDocument mealToMealDocument(Meal meal);

}

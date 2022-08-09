package com.davidbneto.boilerplaterestapi.domain.data.mapper;

import com.davidbneto.boilerplaterestapi.domain.data.model.meal.Meal;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.MealCreationRequest;
import com.davidbneto.boilerplaterestapi.domain.data.model.meal.MealPatchRequest;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MealMapper {

  Meal mealCreationRequestToMeal(MealCreationRequest mealCreationRequest);

  Meal mealPatchRequestToMeal(MealPatchRequest mealPatchRequest);

}

package com.davidbneto.boilerplaterestapi.domain.data.model.dish;

import com.davidbneto.boilerplaterestapi.domain.data.model.ModelBusiness;
import com.davidbneto.boilerplaterestapi.domain.data.model.ingredient.Ingredient;
import java.util.Set;

public class Dish extends ModelBusiness implements Comparable<Dish> {

    private DishCategory category;
    private Set<Ingredient> ingredients;

    public DishCategory getCategory() {
        return category;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public int compareTo(Dish dish) {
        return this.category.getOrder() - dish.getCategory().getOrder();
    }
}

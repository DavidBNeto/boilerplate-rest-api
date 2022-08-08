package com.davidbneto.boilerplaterestapi.domain.data.model.dish;

public enum DishCategory {

  STARTER("Starter", 1),
  MAIN_COURSE("Main Course", 2),
  DESSERT("Dessert", 3);

  private final String name;
  private final int order;

  private DishCategory(final String name, final int order) {
    this.name = name;
    this.order = order;
  }

  public int getOrder() {
    return order;
  }
}

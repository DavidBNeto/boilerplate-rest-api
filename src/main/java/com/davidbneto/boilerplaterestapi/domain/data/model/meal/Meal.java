package com.davidbneto.boilerplaterestapi.domain.data.model.meal;

import com.davidbneto.boilerplaterestapi.domain.data.model.ModelBusiness;
import com.davidbneto.boilerplaterestapi.domain.data.model.dish.Dish;
import java.time.LocalDateTime;
import java.util.TreeSet;

public class Meal extends ModelBusiness {

  private String uuid;
  private String occasion;
  private TreeSet<Dish> dishes;
  private LocalDateTime time;

  public String getUuid() {
    return uuid;
  }

  public String getOccasion() {
    return occasion;
  }

  public TreeSet<Dish> getDishes() {
    return dishes;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public void setOccasion(String occasion) {
    this.occasion = occasion;
  }

  public void setDishes(TreeSet<Dish> dishes) {
    this.dishes = dishes;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }
}

package com.davidbneto.boilerplaterestapi.infrastructure.data;

import com.davidbneto.boilerplaterestapi.domain.data.model.dish.Dish;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "meal")
public class MealDocument {

  private String uuid;
  private String occasion;
  private List<Dish> dishes;
  private LocalDateTime time;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getOccasion() {
    return occasion;
  }

  public void setOccasion(String occasion) {
    this.occasion = occasion;
  }

  public List<Dish> getDishes() {
    return dishes;
  }

  public void setDishes(List<Dish> dishes) {
    this.dishes = dishes;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }
}

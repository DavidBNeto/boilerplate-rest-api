package com.davidbneto.boilerplaterestapi.infrastructure.data;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "meal")
public class MealDocument {

  private String uuid;
  private String occasion;
  private List<String> dishes;
  private LocalDateTime time;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(final String uuid) {
    this.uuid = uuid;
  }

  public String getOccasion() {
    return occasion;
  }

  public void setOccasion(final String occasion) {
    this.occasion = occasion;
  }

  public List<String> getDishes() {
    return dishes;
  }

  public void setDishes(final List<String> dishes) {
    this.dishes = dishes;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(final LocalDateTime time) {
    this.time = time;
  }
}

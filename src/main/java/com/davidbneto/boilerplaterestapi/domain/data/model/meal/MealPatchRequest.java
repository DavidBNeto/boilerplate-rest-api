package com.davidbneto.boilerplaterestapi.domain.data.model.meal;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.lang.Nullable;

public class MealPatchRequest {

  @Nullable
  private String occasion;
  @Nullable
  private List<String> dishes;
  @Nullable
  private LocalDateTime time;

  public String getOccasion() {
    return occasion;
  }

  public List<String> getDishes() {
    return dishes;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setOccasion(String occasion) {
    this.occasion = occasion;
  }

  public void setDishes(List<String> dishes) {
    this.dishes = dishes;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }
}

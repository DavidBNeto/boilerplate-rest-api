package com.davidbneto.boilerplaterestapi.domain.data.model.meal;

import java.time.LocalDateTime;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.lang.Nullable;

public class MealCreationRequest {

  @NotBlank
  private String occasion;
  @Nullable
  private List<String> dishes;
  @NotNull
  private LocalDateTime time;

  public String getOccasion() {
    return occasion;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public List<String> getDishes() {
    return dishes;
  }

  public void setOccasion(final String occasion) {
    this.occasion = occasion;
  }

  public void setTime(final LocalDateTime time) {
    this.time = time;
  }

  public void setDishes(List<String> dishes) {
    this.dishes = dishes;
  }
}

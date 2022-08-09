package com.davidbneto.boilerplaterestapi.domain.data.model.meal;

import com.davidbneto.boilerplaterestapi.domain.data.annotations.Default;
import com.davidbneto.boilerplaterestapi.domain.data.model.ModelBusiness;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import org.springframework.lang.Nullable;

public class Meal extends ModelBusiness {

  private String uuid;
  private String occasion;
  @Nullable
  private Set<String> dishes;
  private LocalDateTime time;

  @Default
  public Meal(final String occasion, final LocalDateTime time) {
    this.dishes = new TreeSet<>();
    this.occasion = occasion;
    this.time = time;
    this.uuid = UUID.nameUUIDFromBytes(
        new StringBuilder()
            .append(occasion)
            .append(time)
            .append(System.currentTimeMillis())
            .toString()
            .getBytes()
    ).toString();
  }

  public String getUuid() {
    return uuid;
  }

  public String getOccasion() {
    return occasion;
  }

  public Set<String> getDishes() {
    return dishes;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setUuid(final String uuid) {
    this.uuid = uuid;
  }

  public void setOccasion(final String occasion) {
    this.occasion = occasion;
  }

  public void setDishes(final Set<String> dishes) {
    this.dishes = dishes;
  }

  public void setTime(final LocalDateTime time) {
    this.time = time;
  }
}

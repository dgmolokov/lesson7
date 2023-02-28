package lesson7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Plate {
  private int food;

  @Override
  public String toString() {
    return "plate: " + food;
  }

  public void decreaseFood(int appetite) {
    this.food -= appetite;
  }

  public void increaseFood(int newFood) {
    this.food += newFood;
  }
}

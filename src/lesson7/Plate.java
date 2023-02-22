package lesson7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Plate {
  private int food;

  public void info() {
    System.out.printf("plate: %s\n", food);
  }

  public void decreaseFood(int appetite) {
    this.food -= appetite;
  }

  public void increaseFood(int newFood) {
    this.food += newFood;
  }
}

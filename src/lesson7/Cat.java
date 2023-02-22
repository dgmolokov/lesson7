package lesson7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Cat {
  private final String name;
  private final int appetite;
  private boolean wellFed;

  public void eat(Plate plate) {
    if (plate.getFood() >= appetite) {
      plate.decreaseFood(appetite);
      setWellFed(true);
    } else {
      System.out.println("В миске недостаточно еды!");
    }
  }
}
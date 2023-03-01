package lesson7;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    var plate = new Plate(100);
    var cats = List.of(
      new Cat("Barsik", 5, false),
      new Cat("Murzik", 7, false),
      new Cat("Huilusha", 10, false),
      new Cat("Eva", 100500, false)
    );
    for (Cat cat : cats) {
      cat.eat(plate);
      System.out.printf("%s satiety: %s\n", cat.getName(), cat.isWellFed());
    }
    System.out.println(plate.toString());
    System.out.println("----------");
    plate.increaseFood(200000);
    for (Cat cat : cats) {
      cat.setWellFed(false);
      cat.eat(plate);
      System.out.printf("%s satiety: %s\n", cat.getName(), cat.isWellFed());
    }
    System.out.println(plate.toString());
  }
}

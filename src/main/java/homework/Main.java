package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    int count = 15;
    Random random = new Random();
    List<Animal> animals = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      switch (random.nextInt(1,5)) {
        case 1:
          animals.add(new Cat());
          animals.get(i).setName(Cat.names.get(random.nextInt(0,3)));
          animals.get(i).setAge(random.nextInt(1,5));
          animals.get(i).setBreed(Cat.breeds.get(random.nextInt(0,3)));
          animals.get(i).setColor(Cat.colors.get(random.nextInt(0,3)));
          System.out.println(animals.get(i));
          break;
        case 2:
          animals.add(new Dog());
          animals.get(i).setName(Dog.names.get(random.nextInt(0,3)));
          animals.get(i).setAge(random.nextInt(1,5));
          animals.get(i).setBreed(Dog.breeds.get(random.nextInt(0,3)));
          animals.get(i).setColor(Dog.colors.get(random.nextInt(0,3)));
          System.out.println(animals.get(i));
          break;
        case 3:
          animals.add(new Hamster());
          animals.get(i).setName(Hamster.names.get(random.nextInt(0,3)));
          animals.get(i).setAge(random.nextInt(1,5));
          animals.get(i).setBreed(Hamster.breeds.get(random.nextInt(0,3)));
          animals.get(i).setColor(Hamster.colors.get(random.nextInt(0,3)));
          System.out.println(animals.get(i));
          break;
        case 4:
          animals.add(new Parrot());
          animals.get(i).setName(Parrot.names.get(random.nextInt(0,3)));
          animals.get(i).setAge(random.nextInt(1,5));
          animals.get(i).setBreed(Parrot.breeds.get(random.nextInt(0,3)));
          animals.get(i).setColor(Parrot.colors.get(random.nextInt(0,3)));
          System.out.println(animals.get(i));
          break;
      }
      switch (random.nextInt(1,5)) {
        case 1:
          animals.get(i).voice();
          break;
        case 2:
          animals.get(i).eat();
          break;
        case 3:
          animals.get(i).sleep();
          break;
        case 4:
          animals.get(i).rest();
          break;
      }
    }

  }
}

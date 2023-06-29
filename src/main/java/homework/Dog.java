package homework;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Dog extends Animal {
    private String name;
    private int age;
    private String breed;
    private String color;
    public static List<String> names = new ArrayList<>();
    public static List<String> breeds = new ArrayList<>();
    public static List<String> colors = new ArrayList<>();
    static {
        names.addAll(Arrays.asList("Агат", "Арчи", "Цезарь"));
        breeds.addAll(Arrays.asList("Бульдог", "Немецкая овчарка", "Такса"));
        colors.addAll(Arrays.asList("Рыжий", "Белый", "Коричневый"));
    }

    @Override
    protected void voice() {
        System.out.println("Гав!");
    }
}

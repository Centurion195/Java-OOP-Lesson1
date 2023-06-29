package homework;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Parrot extends Animal {
    private String name;
    private int age;
    private String breed;
    private String color;
    public static List<String> names = new ArrayList<>();
    public static List<String> breeds = new ArrayList<>();
    public static List<String> colors = new ArrayList<>();
    static {
        names.addAll(Arrays.asList("Федя", "Сеня", "Кеша"));
        breeds.addAll(Arrays.asList("Волнистый", "Корелла", "Какаду"));
        colors.addAll(Arrays.asList("Цветной", "Синий", "Зеленый"));
    }

    @Override
    protected void voice() {
        System.out.println("Чирик!");
    }
}

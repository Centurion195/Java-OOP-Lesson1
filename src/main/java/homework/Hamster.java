package homework;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Hamster extends Animal {
    private String name;
    private int age;
    private String breed;
    private String color;
    public static List<String> names = new ArrayList<>();
    public static List<String> breeds = new ArrayList<>();
    public static List<String> colors = new ArrayList<>();
    static {
        names.addAll(Arrays.asList("Степа", "Петька", "Алла"));
        breeds.addAll(Arrays.asList("Сирийский", "Китайский", "Джунгарский"));
        colors.addAll(Arrays.asList("Рыжий", "Молочный", "Золотистый"));
    }

    @Override
    protected void voice() {
        System.out.println("Пфпф!");
    }
}

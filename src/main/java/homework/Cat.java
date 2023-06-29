package homework;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Cat extends Animal {
    private String name;
    private int age;
    private String breed;
    private String color;
    public static List<String> names = new ArrayList<>();
    public static List<String> breeds = new ArrayList<>();
    public static List<String> colors = new ArrayList<>();
    static {
        names.addAll(Arrays.asList("Барсик", "Дуся", "Тема"));
        breeds.addAll(Arrays.asList("Мейн-кун", "Британец", "Русская"));
        colors.addAll(Arrays.asList("Рыжий", "Белый", "Серый"));
    }

    @Override
    protected void voice() {
        System.out.println("Мяу!");
    }
}

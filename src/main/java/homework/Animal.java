package homework;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public abstract class Animal {
    protected String name;
    protected int age;
    protected String breed;
    protected String color;

    protected void eat() {
        System.out.println("Ем...");
    };
    protected abstract void voice();
    protected void run() {
        System.out.println("Бегу");
    };
    protected void sleep() {
        System.out.println("Сплю...");
    };
    protected void rest() {
        System.out.println("Отдыхаю...");
    };
}

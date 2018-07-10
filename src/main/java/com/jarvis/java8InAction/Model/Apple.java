package com.jarvis.java8InAction.Model;

import java.util.Arrays;
import java.util.List;

/**
 * @author YU.ZHU
 * @project_name: jarvis-java8InAction
 * @package: com.jarvis.java8InAction.Model
 * @create 2018-07-10 14:32
 */
public class Apple {
    private int weight = 0;
    private String color = "";

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static List<Apple> initList() {
        List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
        return inventory;
    }
}

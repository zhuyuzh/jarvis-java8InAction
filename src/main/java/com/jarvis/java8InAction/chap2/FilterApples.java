package com.jarvis.java8InAction.chap2;

import com.jarvis.java8InAction.Model.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author YU.ZHU
 * @project_name: jarvis-java8InAction
 * @package: com.jarvis.java8InAction.chap2
 * @create 2018-07-10 14:36
 */
public class FilterApples {

    public static List<Apple> filterApples(List<Apple> appleList, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        result = appleList.stream().filter( (Apple apple) -> applePredicate.test(apple)).collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        List<Apple> apples = Apple.initList();

        // 使用策略模式分别实例化predicate 缺点：繁重，啰嗦
        System.out.println(FilterApples.filterApples(apples, new AppleGreenColorPredicate()));

        // 使用匿名类来简化代码 缺点：笨重，占用了很多空间
        System.out.println(FilterApples.filterApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        }));

        // 使用lambda 表达式简化编写
        System.out.println(FilterApples.filterApples(apples, (Apple apple) -> "red".equals(apple.getColor())));

        // 泛型化使用
        System.out.println(LambdaFilter.filterGeneric(apples, apple -> "red".equals(apple.getColor())));


        List<Integer> numbers = Arrays.asList(new Integer(80),
                new Integer(155),
                new Integer(120));
        System.out.println(LambdaFilter.filterGeneric(numbers, (Integer i) -> i % 2 == 0));

        // 利用java类库实现
        System.out.println(numbers.stream().filter((Integer i) -> i % 2 == 0).collect(Collectors.toList()));


        // comparator 的使用 匿名类方式
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        // comparator 的使用 lambda表达式
        apples.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        // Runnable 的使用 匿名方式
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名方式");
            }
        });

        // Runnable 的使用 lambda方式
        Thread thread2 = new Thread(() -> System.out.println("lambda 表达式"));

    }
}

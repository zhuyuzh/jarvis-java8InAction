package com.jarvis.java8InAction.chap2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author YU.ZHU
 * @project_name: jarvis-java8InAction
 * @package: com.jarvis.java8InAction.chap2
 * @create 2018-07-10 15:22
 */
public class LambdaFilter {

    /**
     *
     * @description: 泛型化抽象，可用于更泛型处理
     *
     * @author: YU.ZHU
     * @date: 2018/7/10 14:58
     */
    public static <T> List<T> filterGeneric(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        result = list.stream().filter( (T t) -> predicate.test(t)).collect(Collectors.toList());
        return result;
    }
}

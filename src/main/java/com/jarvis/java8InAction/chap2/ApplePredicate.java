package com.jarvis.java8InAction.chap2;

import com.jarvis.java8InAction.Model.Apple;

/**
 *
 * 策略模式--->>>算法族
 *
 * @author YU.ZHU
 * @project_name: jarvis-java8InAction
 * @package: com.jarvis.java8InAction.chap2
 * @create 2018-07-10 14:31
 */
@FunctionalInterface
public interface ApplePredicate {

    boolean test(Apple apple);
}

package com.jarvis.java8InAction.chap2;

import com.jarvis.java8InAction.Model.Apple;

/**
 *
 * 策略模式--->>>策略
 *
 * @author YU.ZHU
 * @project_name: jarvis-java8InAction
 * @package: com.jarvis.java8InAction.chap2
 * @create 2018-07-10 14:33
 */
public class AppHeaveyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}

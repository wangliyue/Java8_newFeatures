package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/*
 * @(#)LambdaTest.java    Created on 2018年10月29日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */

/**
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月29日 下午5:26:59 $
 */
public class LambdaTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));
        // 等价于 下面的写法 。Consumer是一个函数式接口
        Consumer<String> consumer = e -> System.out.println(e);
        Arrays.asList("a", "b", "c").forEach(consumer);

        Arrays.asList("c", "a", "b").sort((e1, e2) -> e1.compareTo(e2));

        Arrays.asList("c", "a", "b").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });

        Comparator<String> comparator = (e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        };
        Arrays.asList("c", "a", "b").sort(comparator);
    }

}

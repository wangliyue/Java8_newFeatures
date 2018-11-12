/*
 * @(#)Functional.java    Created on 2018年10月30日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package lambda;

/**
 * 函数式接口 <br/>
 * 1.只有一个函数的接口,这样的接口可以隐式转换为Lambda表达式 <br/>
 * 2.接口存在默认方法和静态方法不会破坏函数式接口的定义
 *
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月30日 下午6:33:29 $
 */
@FunctionalInterface
public interface Functional {
    // 有且只有一个接口方法
    void method();

    // 存在接口默认方法不会破坏函数式接口的定义
    default void defaultMethod() {

    }
}

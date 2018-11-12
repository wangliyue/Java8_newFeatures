/*
 * @(#)TestMethodReference.java    Created on 2018年10月31日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 方法引用测试类
 *
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月31日 下午2:09:59 $
 */
public class TestMethodReference {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Car类对于构造器的引用，返回一个函数式接口 （相当于定义了 Supplier接口的 get方法，应该返回一个 Car实例）
        Supplier<Car> supplier = Car::new;
        Car car = supplier.get();
        System.out.println(car.name);

        List<Car> carList = new ArrayList<>();
        carList.add(supplier.get());
        carList.add(supplier.get());
        // Car类对于静态方法的引用，返回一个函数式接口 （相当于定义了 Consumer接口的 accept方法 ）
        Consumer<Car> consumer = Car::collide;
        carList.forEach(consumer);

        // Car类对于无参实例方法的引用，返回一个函数式接口 （相当于定义了 Consumer接口的 accept方法 ）
        Consumer<Car> consumer1 = Car::repair;
        carList.forEach(consumer1);

        // Car类实例对于有参实例方法的引用，返回一个函数式接口 （相当于定义了 Consumer接口的 accept方法 ）
        Car myCar = new Car("wangliyue Car");
        Consumer<Car> consumer2 = myCar::follow;
        carList.forEach(consumer2);
    }

}

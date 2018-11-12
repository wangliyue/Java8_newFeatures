/*
 * @(#)Car.java    Created on 2018年10月31日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package methodReference;

/**
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月31日 下午2:08:40 $
 */
public class Car {

    String name;

    /**
     * 构造器
     */
    public Car() {
        this.name = "My Car";
    }

    public Car(String name) {
        this.name = name;
    }

    /**
     * 静态方法
     *
     * @param car
     */
    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.name);
    }

    public void repair() {
        System.out.println("Repaired " + this.name);
    }

}

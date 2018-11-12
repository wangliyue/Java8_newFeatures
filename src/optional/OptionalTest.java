/*
 * @(#)OptionalTest.java    Created on 2018年10月31日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package optional;

import java.util.Optional;

/**
 * Optional仅仅是一个容器：存放T类型的值或者null。它提供了一些有用的接口来避免显式的null检查
 *
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月31日 下午3:56:45 $
 */
public class OptionalTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

        Optional<String> firstName = Optional.of("Tom");
        System.out.println("First Name is set? " + firstName.isPresent());
        System.out.println("First Name: " + firstName.orElseGet(() -> "[none]"));
        System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
        System.out.println();

    }

}

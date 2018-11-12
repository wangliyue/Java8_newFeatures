/*
 * @(#)TestImpl2.java    Created on 2018年10月30日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package defaultMethod;

/**
 * 重写接口默认方法
 *
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月30日 下午6:52:12 $
 */
public class TestImpl2 implements TestInterface {

    @Override
    public String defaultMethod() {
        return TestInterface.super.defaultMethod() + "-----Hello defaultMethod";
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        TestImpl2 test = new TestImpl2();
        String msg = test.defaultMethod();
        System.out.println(msg);
    }

}

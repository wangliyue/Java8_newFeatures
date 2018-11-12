/*
 * @(#)TestImpl.java    Created on 2018年10月30日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package defaultMethod;

/**
 * 继承默认方法
 *
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月30日 下午6:49:56 $
 */
public class TestImpl implements TestInterface {

    public static void main(String[] args) {
        TestImpl test = new TestImpl();
        String msg = test.defaultMethod();
        System.out.println(msg);
    }
}

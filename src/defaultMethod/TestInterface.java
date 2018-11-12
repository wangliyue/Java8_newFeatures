/*
 * @(#)TestInterface.java    Created on 2018年10月30日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package defaultMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 接口新增默认方法和静态方法定义<br/>
 *
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月30日 下午6:42:18 $
 */
public interface TestInterface {

    /**
     * 默认方法 <br/>
     * 接口实现类无需实现接口默认方法，实现类可以继承或者重写默认方法
     *
     * @return
     */
    default String defaultMethod() {
        return "Default implementation";
    }

    /**
     * 静态方法
     * 
     * @return
     */
    static List<Object> create() {
        return new ArrayList<>();
    }

}

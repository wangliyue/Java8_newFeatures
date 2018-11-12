/*
 * @(#)Task.java    Created on 2018年10月31日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package streams;

/**
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月31日 下午4:50:11 $
 */
public class Task {

    private final Status status;
    private final Integer points;

    Task(final Status status, final Integer points) {
        this.status = status;
        this.points = points;
    }

    public Integer getPoints() {
        return points;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d]", status, points);
    }
}

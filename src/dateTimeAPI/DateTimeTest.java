/*
 * @(#)DateTimeTest.java    Created on 2018年11月2日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package dateTimeAPI;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年11月2日 下午2:03:50 $
 */
public class DateTimeTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Clock类使用时区来返回当前的纳秒时间和日期。<br/>
         * Clock可以替代System.currentTimeMillis()和TimeZone.getDefault()。
         */
        Clock clock = Clock.system(ZoneOffset.ofHours(8));
        System.out.println(clock.instant());
        System.out.println(clock.millis());

        /**
         * LocalDate仅仅包含ISO-8601日历系统中的日期部分
         */
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate dateFromClock = LocalDate.now(clock);
        System.out.println(dateFromClock);

        /**
         * LocalTime则仅仅包含该日历系统中的时间部分.
         */
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime timeFromClock = LocalTime.now(clock);
        System.out.println(timeFromClock);

        /**
         * LocalDateTime类包含了LocalDate和LocalTime的信息，但是不包含ISO-8601日历系统中的时区信息
         */
        LocalDateTime datetime = LocalDateTime.now();
        LocalDateTime datetimeFromClock = LocalDateTime.now(clock);
        System.out.println(datetime);
        System.out.println(datetimeFromClock);

        /**
         * 如果你需要特定时区的data/time信息，则可以使用ZoneDateTime，它保存有ISO-8601日期系统的日期和时间，而且有时区信息
         */
        final ZonedDateTime zonedDatetime = ZonedDateTime.now();
        final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now(clock);
        final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDatetime);
        System.out.println(zonedDatetimeFromClock);
        System.out.println(zonedDatetimeFromZone);

        /**
         * Duration类，它持有的时间精确到秒和纳秒。这使得我们可以很容易得计算两个日期之间的不同
         */
        final LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 16, 0, 0, 0);
        final LocalDateTime to = LocalDateTime.of(2015, Month.APRIL, 16, 23, 59, 59);

        final Duration duration = Duration.between(from, to);
        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours: " + duration.toHours());

    }

}

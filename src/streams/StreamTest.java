/*
 * @(#)StreamTest.java    Created on 2018年10月31日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package streams;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 新增了Stream接口 <br/>
 *
 * Stream 接口中的抽象方法支持函数式接口类型的参数
 *
 * @author wangly
 * @version $Revision: 1.0 $, $Date: 2018年10月31日 下午4:29:50 $
 */
public class StreamTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Collection<Task> tasks = Arrays.asList(new Task(Status.OPEN, 5), new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8));
        /**
         * 计算OPEN状态的task实例的point合计值 <br/>
         * Collection集合的stream方法返回一个 Stream接口实例
         */
        long totalPointsOfOpenTasks = tasks.stream().filter(task -> task.getStatus() == Status.OPEN)
                .mapToInt(Task::getPoints).sum();
        System.out.println("OPEN状态的task实例的point合计值 :" + totalPointsOfOpenTasks);

        /**
         * 计算所有task的point合计值
         */
        double totalPoints = tasks.stream().parallel().map(task -> task.getPoints()) // or map( Task::getPoints )
                .reduce(0, Integer::sum);
        System.out.println("所有task的point合计值:" + totalPoints);

        /**
         * 根据Status状态将task实例进行分组
         */
        Map<Status, List<Task>> map = tasks.stream().collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(map);

        /**
         * 从文件或者网络一行一行得读取数据
         */
        final Path path = new File("D:\\workspace\\Java8_newFeatures\\bin\\a.txt").toPath();
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            lines.onClose(() -> System.out.println("Done!")).forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}

package com.github.javarar.lucky.ticket;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpbLuckyTicket extends LuckyTicket {

    boolean isLucky(String number) {
        var array = number.split("");
        var result = Stream.of(array)
                .map(Integer::parseInt)
                .collect(Collectors.partitioningBy(s -> s % 2 == 0));
        return sum(result.get(true)) == sum(result.get(false));
    }

    private int sum(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
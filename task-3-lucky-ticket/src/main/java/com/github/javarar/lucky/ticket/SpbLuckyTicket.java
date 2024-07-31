package com.github.javarar.lucky.ticket;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpbLuckyTicket extends LuckyTicket {

    boolean isLucky(String number) {
        var array = number.split("");
        var result = Stream.of(array)
                .map(Integer::parseInt)
                .collect(
                        Collectors.partitioningBy(s -> s % 2 == 0,
                        Collectors.summingInt(s -> s)
                        )
                );
        return result.get(true).equals(result.get(false));
    }

}
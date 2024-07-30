package com.github.javarar.lucky.ticket;

import java.util.Random;
import java.util.stream.Stream;

public abstract class LuckyTicket {

    public double luckyTicketProbability(int serialNumberLength) {
        var rand = new Random();
        var maxNumber = Stream.generate(() -> "9")
                .limit(serialNumberLength)
                .reduce("", String::concat);
        var numbersSize = 1000;

        var luckyCount = rand.ints(numbersSize, 0, Integer.parseInt(maxNumber))
                .boxed()
                .map(s -> String.format("%0" + serialNumberLength + "d", s))
                .parallel()
                .filter(this::isLucky)
                .peek(System.out::println)
                .count();
        return (double) luckyCount / numbersSize;
    }

    abstract boolean isLucky(String number);
}
package com.github.javarar.lucky.ticket;

public class MoscowLuckyTicket extends LuckyTicket {

    boolean isLucky(String number) {
        var half = number.length() / 2;
        var firstPart = number.substring(0, half);
        var second = number.substring(half);
        return Integer.parseInt(firstPart) == Integer.parseInt(second);
    }
}
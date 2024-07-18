package com.github.javarar.lucky.ticket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LuckyTicketTest {

    @DisplayName("Задание 7. Счастливый билет")
    @ParameterizedTest
    @MethodSource("cases")
    public void luckyTicketProbabilityTest(int serialNumberLength, double probability) {
        throw new UnsupportedOperationException("реализуй меня");
    }

    private static Stream<Arguments> cases() {
        throw new UnsupportedOperationException("реализуй меня");
    }

}
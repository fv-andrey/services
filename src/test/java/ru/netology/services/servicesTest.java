package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class servicesTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/monthRest.csv")

    public void calculateMonthRest(int income, int expense, int threshold, int expected) {

        services service = new services();

        int actual = service.calcMonthsRest(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

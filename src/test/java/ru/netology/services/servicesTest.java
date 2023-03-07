package ru.netology.services;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.services;

public class servicesTest {

    @ParameterizedTest
    //@CsvSource({
    //"10000,3000,20000,3",
    //"100000,60000,150000,2"
    //})
    @CsvFileSource(files = "src/test/resources/monthRest.csv")
    public void calculateMonthRestA(int income, int expense, int threshold, int expected) {

        services service = new services();

        //int income = 10_000;
        //int expense = 3_000;
        //int threshold = 20_000;

        //int expected = 3;
        int actual = service.calcMonthsRest(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void calculateMonthRestB() {

    //services service = new services();

    //int income = 100_000;
    //int expense = 60_000;
    //int threshold = 150_000;

    //int expected = 2;
    //int actual = service.calcMonthsRest(income, expense, threshold);

    //Assertions.assertEquals(expected, actual);
    //}
}

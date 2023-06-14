package ru.netology.services;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.BudgetService;

public class BudgetServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Budget.csv")
    public void testHolidayMonthCounter(int expected, int income, int expense, int threshold) {
        BudgetService service = new BudgetService();


        int actual = service.calculate(income,expense,threshold);

        Assertions.assertEquals(expected, actual);
    }
}

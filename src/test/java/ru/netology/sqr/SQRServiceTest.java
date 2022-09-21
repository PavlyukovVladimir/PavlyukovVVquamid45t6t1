package ru.netology.sqr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    private SQRService service;

    @BeforeEach
    void setUp() {
        service = new SQRService();
    }

    @DisplayName("Параметризованный тест подсчета квадратов чисел в диапазоне")
    @ParameterizedTest(name = "{index} - {3}, диапазон [{0}, {1}]")
    @CsvFileSource(files = "src/test/resources/testData.csv")
    void countSquaresInRange(long min, long max, int expected, String description) {
        assertEquals(expected, service.countSquaresInRange(min, max));
    }
}
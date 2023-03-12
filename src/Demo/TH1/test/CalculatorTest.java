package Demo.TH1.test;

import Demo.TH1.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operrator = '-';
        int expected = 1;
        int result = Calculator.calculate(firstOperand,secondOperand,operrator);
        assertEquals(expected,result);
    }
}

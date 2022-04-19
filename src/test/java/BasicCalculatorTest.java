import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result); //el assertEquals compara si los numeros ingresados  y sumados son iguales a la variable expectedValue
    }


    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    
    @Test
    public void multi() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.multi(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test

    public void restar() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 2L;
        Long expectedValue = 3L;

        // Act

        Long result = basicCalculator.restar(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }


    @Test
    public void divdir() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 1L;
        Long expectedValue = 5L;

        // Act

        Long result = basicCalculator.dividir(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }




}
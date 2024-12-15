import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmUtilsTest {

    // Тести для методу findMinPositive
    @Test
    void testFindMinPositive() {
        assertEquals(1, AlgorithmUtils.findMinPositive(new int[]{3, 1, 4, 5}));
        assertEquals(2, AlgorithmUtils.findMinPositive(new int[]{2, 2, 3}));
        assertEquals(-1, AlgorithmUtils.findMinPositive(new int[]{-1, -2, -3}));
    }

    // Тести для методу sumNegativeNumbers
    @Test
    void testSumNegativeNumbers() {
        assertEquals(-6, AlgorithmUtils.sumNegativeNumbers(new int[]{-1, -2, -3}));
        assertEquals(0, AlgorithmUtils.sumNegativeNumbers(new int[]{1, 2, 3}));
        assertEquals(-3, AlgorithmUtils.sumNegativeNumbers(new int[]{-1, 2, -2}));
    }

    // Тести для методу fibonacci
    @Test
    void testFibonacci() {
        assertEquals(0, AlgorithmUtils.fibonacci(0));
        assertEquals(1, AlgorithmUtils.fibonacci(1));
        assertEquals(21, AlgorithmUtils.fibonacci(8));
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.fibonacci(-1));
    }

    // Тести для методу calculateCurrent
    @Test
    void testCalculateCurrent() {
        assertEquals(2.0, AlgorithmUtils.calculateCurrent(10, 5));
        assertEquals(0.5, AlgorithmUtils.calculateCurrent(1, 2));
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.calculateCurrent(10, 0));
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.calculateCurrent(10, -5));
    }
}

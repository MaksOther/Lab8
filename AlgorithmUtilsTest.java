public class AlgorithmUtilsTest {
    public static void main(String[] args) {
        testFindMinPositive();
        testSumNegativeNumbers();
        testFibonacci();
        testCalculateCurrent();
    }

    // Тесты для метода findMinPositive
    public static void testFindMinPositive() {
        System.out.println("Running testFindMinPositive...");
        int[] array1 = {3, 1, 4, 5};
        assertEqual(1, AlgorithmUtils.findMinPositive(array1), "Test Case 1");

        int[] array2 = {2, 2, 3};
        assertEqual(2, AlgorithmUtils.findMinPositive(array2), "Test Case 2");

        int[] array3 = {-1, -2, -3};
        assertEqual(-1, AlgorithmUtils.findMinPositive(array3), "Test Case 3");
    }

    // Тесты для метода sumNegativeNumbers
    public static void testSumNegativeNumbers() {
        System.out.println("Running testSumNegativeNumbers...");
        int[] array1 = {-1, -2, -3};
        assertEqual(-6, AlgorithmUtils.sumNegativeNumbers(array1), "Test Case 1");

        int[] array2 = {1, 2, 3};
        assertEqual(0, AlgorithmUtils.sumNegativeNumbers(array2), "Test Case 2");

        int[] array3 = {-1, 2, -2};
        assertEqual(-3, AlgorithmUtils.sumNegativeNumbers(array3), "Test Case 3");
    }

    // Тесты для метода fibonacci
    public static void testFibonacci() {
        System.out.println("Running testFibonacci...");
        assertEqual(0, AlgorithmUtils.fibonacci(0), "Test Case 1");
        assertEqual(1, AlgorithmUtils.fibonacci(1), "Test Case 2");
        assertEqual(21, AlgorithmUtils.fibonacci(8), "Test Case 3");

        try {
            AlgorithmUtils.fibonacci(-1);
            System.out.println("Test Case 4 Failed: Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Case 4 Passed: Caught IllegalArgumentException");
        }
    }

    // Тесты для метода calculateCurrent
    public static void testCalculateCurrent() {
        System.out.println("Running testCalculateCurrent...");
        assertEqual(2.0, AlgorithmUtils.calculateCurrent(10, 5), "Test Case 1");
        assertEqual(0.5, AlgorithmUtils.calculateCurrent(1, 2), "Test Case 2");

        try {
            AlgorithmUtils.calculateCurrent(10, 0);
            System.out.println("Test Case 3 Failed: Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Case 3 Passed: Caught IllegalArgumentException");
        }
    }

    // Метод для проверки значений
    public static void assertEqual(double expected, double actual, String testCase) {
        if (expected == actual) {
            System.out.println(testCase + " Passed");
        } else {
            System.out.println(testCase + " Failed: Expected " + expected + ", but got " + actual);
        }
    }
}

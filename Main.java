public class Main {
    public static void main(String[] args) {
        int[] array = {3, 1, -4, 5};

        System.out.println("Мінімальне позитивне: " + AlgorithmUtils.findMinPositive(array));
        System.out.println("Сума негативних: " + AlgorithmUtils.sumNegativeNumbers(array));
        System.out.println("Фібоначчі (8): " + AlgorithmUtils.fibonacci(8));
        System.out.println("Сила струму: " + AlgorithmUtils.calculateCurrent(10, 5));
    }
}

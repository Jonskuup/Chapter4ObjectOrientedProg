public class Calculator {
    private int value = 0;

    public void reset() {
        value = 0;
    }

    public void sum(int[] numbers) {
        // Add all integers in the array to the calculator
        for (int number : numbers) {
            value += number;
        }
    }
}

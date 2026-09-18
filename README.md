# Calculator

This is a simple calculator application that can add positive integers and reset the calculator value to zero.

```java
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
```

## How the Calculator works explained by Copilot:

The `Calculator` class is a simple implementation of a calculator that can perform addition of positive integers and reset its value to zero.

## Modified by me:

The `Calculator` class is a simple calculator that can add integers and reset its current value.
The `value` variable stores the current value of the calculator. The `reset()` method sets the value back to zero.
The `sum()` method takes an array of integers as a parameter. It goes through the numbers one by one using a `for`loop and adds each number to the calculator's current value.


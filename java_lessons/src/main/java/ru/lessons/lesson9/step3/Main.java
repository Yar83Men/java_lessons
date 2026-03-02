package ru.lessons.lesson9.step3;

public class Main {
    public static void main(String[] args) {
        final var calculator = new CalculatorImpl();
        final var res = calculator.div(1.0, 0.0);
    }
}

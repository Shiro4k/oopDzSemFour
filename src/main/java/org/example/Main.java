package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = List.of(5, 5, 5);
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(numbers) = " + calculator.sum(numbers));
        System.out.println("calculator.division(numbers) = " + calculator.division(numbers));
        System.out.println("calculator.multiply(numbers) = " + calculator.multiply(numbers));

        Calculator<Integer> intCalculator = new Calculator<>(5);
        System.out.println("intCalculator.binaryConversion() = " + intCalculator.binaryConversion());

        Calculator<String> stringCalculator = new Calculator<>("5");
        System.out.println("stringCalculator.binaryConversion() = " + stringCalculator.binaryConversion());

        Calculator<Double> doubleCalculator = new Calculator<>(5.0);
        System.out.println("doubleCalculator.binaryConversion() = " + doubleCalculator.binaryConversion());
//        System.out.println("calculator.toBinaryString(2) = " + calculator.toBinaryString(101));
    }
}
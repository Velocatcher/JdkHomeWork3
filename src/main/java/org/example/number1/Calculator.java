package org.example.number1;

/*Написать класс Калькулятор (необобщенный), который содержит обобщенные
статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
Методы должны возвращать результат своей работы.*/


public class Calculator {

    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number> double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(5, 3.5));
        System.out.println("Multiply: " + multiply(5, 3.5));
        System.out.println("Divide: " + divide(10, 2.4));
        System.out.println("Subtract: " + subtract(8, 3.5));
    }
}

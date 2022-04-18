package main;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    double operand1;
    double operand2;

    Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi operand1 i operand2: ");
        operand1 = scanner.nextDouble();
        operand2 = scanner.nextDouble();

        char operator;

        System.out.println("Unesi operator: (add = +, sub = -, mul = *, div = /)");
        operator = scanner.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(operand1 + operand2);
                break;
            case '-':
                System.out.println(operand1 - operand2);
                break;
            case '*':
                System.out.println(operand1 * operand2);
                break;
            case '/':
                System.out.println(operand1 / operand2);
                break;
        }







    }
}

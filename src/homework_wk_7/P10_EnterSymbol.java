package homework_wk_7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class P10_EnterSymbol {
    public static void main(String[] args) {
        char ch;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num = scanner.nextInt();

        System.out.println("Enter the second number :");
        int num1 = scanner.nextInt();

        System.out.println("Enter the symbol you want(+,-,*,/) :");
        ch = scanner.next().charAt(0);
        scanner.close();

        if (ch == '+') {
            System.out.println("\nAddition of" + num + "+" + num1 + "=" + (num + num1));
        } else if (ch == '-') {
            System.out.println("Subtraction of" + num + "-" + num1 + "=" + (num - num1));

        } else if (ch == '*') {
            System.out.println("Multiplication of" + num + "*" + num1 + "=" + (num * num1));

        } else if (ch == '/') {
            System.out.println("Division of" + num + "/" + num1 + "=" + (num / num1));

        } else {
            System.out.println("Symbol is not available");
        }
    }

}

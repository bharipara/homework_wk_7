package homework_wk_7;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class P1_InputNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int num = input.nextInt();
        input.close();

        //ternary operator to check number
        String result = num %2==0 ? "Even" : "Odd";

        System.out.println(num +" is "+ result);

    }
}

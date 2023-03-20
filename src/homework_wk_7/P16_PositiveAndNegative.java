package homework_wk_7;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class P16_PositiveAndNegative {
    public static void main(String[] args) {

        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number :");
        number=scanner.nextInt();
        scanner.close();

        if (number>0)
            System.out.println("its a positive number");
        else if (number<0) {
            System.out.println("its a negative number");
        }else
            System.out.println("Its zero");

        }
    }



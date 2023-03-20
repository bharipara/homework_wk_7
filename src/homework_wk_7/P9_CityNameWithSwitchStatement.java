package homework_wk_7;
/**
 * 9. Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class P9_CityNameWithSwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter City name start from A to F");
        char name = scanner.next().charAt(0);
        scanner.close();


        switch (name) {
            case 'A' :
                System.out.println("Aberdeen");
                System.out.println();
                break;

            case 'B':
                System.out.println("Birmingham");
                break;

            case 'C':
                System.out.println("Coventry");
                break;

            case 'D':
                System.out.println("Derby");
                break;

            case 'E':
                System.out.println("Erdington");
                break;

            case 'F':
                System.out.println("Fairbourn");
                break;

            default:
                System.out.println("Invalid Character");
        }
        System.out.println("Thank You");
    }
}

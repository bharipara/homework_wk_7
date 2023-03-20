package homework_wk_7;
/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class P8_CityName {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input an alphabet from A to F > ");

            String alphabet = scanner.next() ;
            scanner.close();
            if("A".equals(alphabet)){
                System.out.println("Ayl");
            }else if("B".equals(alphabet)){
                System.out.println("Bristol");
            }else if("C".equals(alphabet)){
                System.out.println("Cardiff");
            }else if("D".equals(alphabet)){
                System.out.println("Dublin");
            }else if("E".equals(alphabet)){
                System.out.println("Edinburgh");
            }else if("F".equals(alphabet)){
                System.out.println("Florence");
            }else {
                System.out.println("Invalid entry.");
            }

        }
    }


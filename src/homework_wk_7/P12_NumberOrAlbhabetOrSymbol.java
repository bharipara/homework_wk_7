package homework_wk_7;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

public class P12_NumberOrAlbhabetOrSymbol {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the value :");
        char ch =scanner.next().charAt(0);
        scanner.close();

        //char ch= '@';
         if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
             System.out.println("Alphabet");
         } else if (ch>='1' && ch<='9') {
             System.out.println("It's a number");

         }else {
             System.out.println("It's a symbol");
         }
    }


}

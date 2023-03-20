package homework_wk_7;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 *         English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 *         Input, Marks should between 0 to 100”) and find out total, percentage and result.
 *         If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 *         %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *         _______________________________
 *         | |
 *         | Mark Sheet |
 *         |_______________________________|
 *         | Name : Jay |
 *         | Roll No: 08 |
 *         |_______________________________|
 *         | Subjects : Marks |
 *         |_______________________________|
 *         | Math : 98 |
 *         | Science : 90 |
 *         | English : 85 |
 *         |_______________________________|
 *         | Total : 273 |
 *         |_______________________________|
 *         | Percentage : 91.0 |
 *         | Result : Pass |
 *         | Grade : A+ |
 *         |_______________________________|
 */
public class P3_MarkSheet {

   String name;
   int roll,maths,science,english;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name :");
        String name= scanner.nextLine();
        System.out.println("Enter roll number :");
        int roll =scanner.nextInt();
        System.out.println("Enter maths marks :");
        int m = scanner.nextInt();
        System.out.println("Enter Science marks :");
        int m1 =scanner.nextInt();
        System.out.println("Enter english marks :");
        int m2 = scanner.nextInt();

        scanner.close();

        int total = m + m1 + m2;
        float percentage = (total*100)/300;
        String Grade = "";
        String Result = " ";
        if (percentage >= 80) {
            Grade = "A+";
            Result= "Pass";
        } else if (percentage >= 60) {
            Grade = "A";
            Result= "Pass";
        } else if (percentage >= 50) {
            Grade = "B";
            Result= "Pass";
        } else if (percentage >= 35) {
            Grade = "C";
            Result= "Pass";
        } else if (percentage < 35) {
            Result= "Fail";
            Grade = " ";
        }

        System.out.println("------------------------------------------" );
        System.out.println("|                                         |");
        System.out.println("|            Mark Sheet                   |");
        System.out.println("|                                         |");
        System.out.println("------------------------------------------");
        System.out.println("|   Name             : " + name+"                |");
        System.out.println("|   Roll No          : " + roll+"                 |");
        System.out.println("|---------------------------------------- |");
        System.out.println("|   Subjects         :  Marks             |");
        System.out.println("|---------------------------------------- |");
        System.out.println("|   Math             :  " + m +"                |");
        System.out.println("|   Science          :  " + m1+"                |");
        System.out.println("|   English          :  " + m2+"                |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|   Total            :"+ total +"                 |");
        System.out.println("-------------------------------------");
        System.out.println("|   Percentage       :"+ percentage+"                |");
        System.out.println("    Result            : " +Result +"                |");
        System.out.println("|   Grade            : " + Grade+"                  |");
        System.out.println( "-------------------------------------------------|");



        //System.out.println("Total Marks = " + total);
        //System.out.println("Percentage = " + percentage);
        //System.out.println("Grade = " + result);
        //System.out.println("Results =" );

    }


    }



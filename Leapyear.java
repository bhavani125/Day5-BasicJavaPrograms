package Programs;

import java.util.Scanner;

public class Leapyear {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter a 4 digit number: ");
       int  year = sc.nextInt();

       if ( (year%4 == 0 && year%100 != 0) || year%400 == 0 ) {
           System.out.println(year + " is a Leap year.");
       } else {
           System.out.println(year + " is not a Leap year.");
       }
}
}

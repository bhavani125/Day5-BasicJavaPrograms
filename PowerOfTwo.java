package Programs;

import java.util.Scanner;

public class PowerOfTwo {
  public static void main(String[] args) {
	System.out.println("enter number for power of 2");
	Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int power = 1;

    if (number>0 && number<31) {
        for (int i=1; i<=number; i++) {
        	 power = 2 * power ;
            System.out.println(2 + " to the power " + i + " : " + power);
        }
    } else {
        System.out.println("It exceeds the 'int' datatype limit");
    }
}
}

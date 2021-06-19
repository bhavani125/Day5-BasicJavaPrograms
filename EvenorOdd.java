package Programs;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		System.out.println("Checking wheather a number is even or odd");
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }
	}

}

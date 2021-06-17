package Programs;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter a number that how many times u want to flip the coin");
     int flip = s.nextInt();
     if (flip > 0) {
         int i = 1;
         int head = 0;
         int tail = 0;
         while (i <= flip) {
             double random = Math.random();
             if (random < 0.5) {
                 //System.out.println("Tail");
             } else {
                 //System.out.println("Head");
                 head++;
             }
             i++;
         }
         System.out.println("Head count = " + head);
         tail = flip - head;
         System.out.println("Tail count = " + tail);
         double headPercentage = (head*100.0)/flip;
         System.out.printf("Head percentage = %.2f %n", headPercentage);
         double tailPercentage = 100 - headPercentage;
         System.out.printf("Tail percentage = %.2f %n ", tailPercentage);

     } else {
         System.out.println("Enter positive number.");
     }
 }
}


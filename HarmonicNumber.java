package Programs;

import java.util.Scanner;

public class HarmonicNumber {
  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num = s.nextInt();
      double harmonicnumber = 0;

      if (num>0) {
          for (int i=1; i<=num; i++) {
              harmonicnumber = harmonicnumber + (1.0/i);
          }
          System.out.printf("Harmonic number is: %.4f ", harmonicnumber);
      } else {
          System.out.println("Number should be greater than 0.");
      }
}
}

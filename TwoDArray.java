package Programs;

import java.util.Scanner;

   public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size of an array");
        int arrRowSize = sc.nextInt();
        System.out.println("Enter column size of an array");
        int arrColmSize = sc.nextInt();

      int[][] arrName = new int[arrRowSize][arrColmSize];
      for (int i=0; i<arrRowSize; i++) {
          for (int j = 0; j < arrColmSize; j++) {
              System.out.println("Enter a number");
              arrName[i][j] = sc.nextInt();
          }
      }
        for (int i=0; i<arrRowSize; i++) {
            for (int j=0; j<arrColmSize; j++) {
                System.out.println(arrName[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}

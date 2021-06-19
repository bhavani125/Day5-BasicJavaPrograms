package Programs;

import  java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate value: ");
        int x = sc.nextInt();
        System.out.println("Enter The y coordinate value; " );
        int y = sc.nextInt();
        double distance  = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.printf("Euclidean Distance is %.2f",distance);
    }
}

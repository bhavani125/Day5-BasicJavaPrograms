package Programs;

import java.util.Scanner;

public class CheckingVowelsandConsonant {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	System.out.println("Checking an alphabet is vowel or Consonant");
	System.out.println("Enter alphabet");
	char alphabet = s.next().charAt(0);
    switch (alphabet) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println(alphabet + " is vowel");
            break;
        default:
            System.out.println(alphabet + " is consonant");
    }

}
}

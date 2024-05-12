package task9;

import java.util.Scanner;

public class Task9firstprogram {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check if it is a palindrome: ");
	        int number = scanner.nextInt();
	        int originalNumber = number;
	        int reversedNumber = 0;

	        for (int temp = number; temp != 0; temp = temp/ 10) {
	            int digit = temp % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	        }

	        if (originalNumber == reversedNumber) {
	            System.out.println(originalNumber + " is a palindrome number.");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome number.");
	        }
	}

}

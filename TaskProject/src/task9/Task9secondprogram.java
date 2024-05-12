package task9;

import java.util.Scanner;

public class Task9secondprogram {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String str= scn.nextLine();
		 String reversed = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }

	        System.out.println("Original string: " + str);
	        System.out.println("Reversed string: " + reversed);
	}

}

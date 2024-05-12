package task9;

import java.util.Scanner;

public class Task9seventhprogram {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int num1= scn.nextInt();
		int num2= scn.nextInt();
		int num3= scn.nextInt();
		int largenum=num1;
		if(num2>largenum) {
			largenum=num2;
		}
		if(num3>largenum){
			largenum=num3;
		}
		System.out.println("The largest number is "+ largenum);
	}

}

package task9;

import java.util.Scanner;

public class Task9fifthprogram {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int marks= scn.nextInt();
		if(marks==100) {
			System.out.println("Student grade is "+ "S");
		}
		else if(marks>=90&&marks<99) {
			
			System.out.println("Student grade is "+ "A");	
			
		}
else if(marks>=80&&marks<89) {
			
			System.out.println("Student grade is "+ "B");
		}
else if(marks>=70&&marks<79) {
	
	System.out.println("Student grade is "+ "C");
	}
else if(marks>=60&&marks<69) {
	
	System.out.println("Student grade is "+ "D");
}
else if(marks>=50&&marks<59) {
	
	System.out.println("Student grade is "+ "E");
}
else if(marks<50){
	System.out.println("Student grade is "+ "F");
}
	else if(marks>100) {
		System.out.println("Invalid input");
	}
	else {
	}

	}

}

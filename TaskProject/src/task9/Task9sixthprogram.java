package task9;

import java.util.Scanner;

public class Task9sixthprogram {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		float rent= scn.nextFloat();
		int month= scn.nextInt();
		int days= scn.nextInt();
		switch (month) {
        case 04:
            double rent1= (0.2*rent+rent)*days;
            System.out.println("hotel tariff is:"+ rent1);
            break;
        case 05:
        	double rent2= (0.2*rent+rent)*days;
        	System.out.println("hotel tariff is:"+ rent2);
        	break;
        case 06:
        	double rent3= (0.2*rent+rent)*days;
        	System.out.println("hotel tariff is:"+ rent3);
        	break;
        case 11:
        	double rent4= (0.2*rent+rent)*days;
        	System.out.println("hotel tariff is:"+ rent4);
        	break;
        case 12:
        	double rent5= (0.2*rent+rent)*days;
        	System.out.println("hotel tariff is:"+ rent5);
        	break;
        	
        default:
            // For other months, no additional cost
        	double rent6= rent*days;
        	System.out.println("hotel tariff is:"+ rent6);
            break;

	}

	}
}

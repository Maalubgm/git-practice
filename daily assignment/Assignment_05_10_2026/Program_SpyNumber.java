package dailyassignment;

import java.util.Scanner;

public class Program_SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =1124;
        System.out.print("Enter a number:"+num);       
        int sum = 0, product = 1;      
        for (int temp = num; temp > 0; temp/=10) {      	
            int digit = temp % 10;
            sum =sum+ digit;
            product =product* digit;
        }
        System.out.println("Sum of digits = " +sum);
        System.out.println("Product of digits = " + product);

        if (sum == product) {
            System.out.println(num + " is a Spy Number");
        } else {
            System.out.println(num + " is not a Spy Number");
        }
	}

}

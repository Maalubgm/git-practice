package assignment;

public class Program_SumEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

        for (int i = 2; i <= 50; i += 2) { // only even numbers
            sum =sum+i;
        }

        System.out.println("Sum of even numbers = " + sum);
	}

}

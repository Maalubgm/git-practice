package assignment;

public class Program_Palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		   int original=num;
		   int reverse=0;
		   for(;num>0;)
		   {
			   int lastDigit=num%10;
			   reverse=reverse*10+lastDigit;
			   num=num/10;
			   
		   }
	        if (original == reverse) {
	            System.out.println(original + " is a palindrome");
	        } else {
	            System.out.println(original + " is not a palindrome");
	        }
	}

}

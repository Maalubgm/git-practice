package assignment;

public class Program_ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
   int original=num;
   int reverse=0;
   for(;num>0;)
   {
	   int lastDigit=num%10;
	   reverse=reverse*10+lastDigit;
	   num=num/10;
	   
   }
   System.out.println("Reverse:"+reverse);
   if(original==reverse)
	   System.out.println("Palindrome");
   else
	   System.out.println("Not a Palindrome");
  
	}

}

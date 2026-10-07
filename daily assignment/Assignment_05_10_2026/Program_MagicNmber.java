package day9;

public class Program24_MagicNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=172;
        int original=num;
        int sum=0;
        for(;num>9;)
        {
        	for(;num>0;)
        	{
        	int digit=num%10;
        	sum=sum+digit;
        	num=num/10;      	
        }
       
    num=sum;
    sum=0;
        	
	}
	System.out.println("Final value of num:"+num);
	if(num==1)
		System.out.println("Magic Number");
		
	}


}

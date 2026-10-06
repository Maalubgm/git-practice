package assignment;

public class Program_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153; 
        int original = num;
        int armstrong = 0;

       for (;num > 0;) {
            int lastdigit = num % 10;      
            armstrong =armstrong+lastdigit * lastdigit * lastdigit; 
            num =num/10;                  
        }
       System.out.println(armstrong);

        if (armstrong == original) {
            System.out.println("it is an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number.");
        }

	}

}

package day9;

public class Program25_Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int row=1;row<=5;row++)
      {
          for(int star=1;star<=row;star++)
        	  System.out.print("*");
          for(int sp=1;sp<=10-2*row;sp++)
        	  System.out.print(" ");
          for(int star=1;star<=row;star++)
        	  System.out.print("*");
          System.out.println();
          
      }
      for(int row=1;row<=4;row++)
      {
      for(int star=1;star<=5-row;star++)
    	  System.out.print("*");
      for(int sp=1;sp<=2*row;sp++)
    	  System.out.print(" ");
      for(int star=1;star<=5-row;star++)
    	  System.out.print("*");
      System.out.println();
      
	}
	}

}

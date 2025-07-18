package wiprotraining;

public class Reversenumber {
public static void main(String[] args) {
		
		int n=1234;
	     
	     while(n!=0) {
	    	 int rev=n%10;
	    	 System.out.print(rev);
	    	 n=n/10;
	      }
	}

}

package wiprotraining;

public class primenum {
	public static void main(String[] args) {
		
	       int n=34;
	       int count=0;
	       if(n<=1) {
	    	   System.out.println("It is not a Prime");
	       }else {
	       for(int i=2;i<=Math.sqrt(n);i++) {
	    	   if(n%i==0) {
	    		   count ++;
	    		   break;
	    	   }
	         }
	       }
	    	   if(count==0) {
	    		   System.out.println("It is a Prime");
	    	   } 
	       else {
			   System.out.println("It is not a Prime");
	       }
	}

}

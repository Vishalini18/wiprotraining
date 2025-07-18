package wiprotraining;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=10;i<=99;i++) {
    		 boolean isprime=true;
    		 for(int j=2;j<Math.sqrt(i);j++) {
    			 if(i%j==0) {
    				 isprime=false;
    				 break;
    			 }
    		 }
    		 if(isprime) {
    			 System.out.print(i + " ");
    		 }
    	 }  
	}

}

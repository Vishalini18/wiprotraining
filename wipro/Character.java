package wiprotraining;

public class Character {

	public static void main(String[] args) {
	      char ch='#';
	      if((ch>=65 && ch<=90 ) || (ch>=97 && ch<=122)){
	    	  System.out.println("alphabet");
	      }
	      else if(ch>='0' && ch<='9') {
	    	  System.out.println("digit");
	      }
	      else {
	    	  System.out.println("special character");
	      }
	}
		// TODO Auto-generated method stub

	

}

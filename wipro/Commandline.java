package wiprotraining;

public class Commandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1) {
	    	   System.out.println("Invalid");
	       }else {
	    	   System.out.println(args[0] + "," + args[1]);
	       }
	}

}

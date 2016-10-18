import java.util.Scanner;


public class Gdc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner (System.in);
	    System.out.println("Insert the first divisor:");
	     int n1=scan.nextInt();
	     System.out.println("Insert the second divisor:");
	     int n2=scan.nextInt();
	     
	     System.out.println("Greatest common divisor between "+n1+" and "+n2+ " is:"+solve_gdc(n1, n2));
	}

	static int solve_gdc(int a, int b) {
       if(b==0)
           return a;
       else
           return solve_gdc(b, a % b);
	} 
	
}

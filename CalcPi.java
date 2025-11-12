// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	 int N = Integer.parseInt(args[0]);
	 double piapprox = 1.0;
	 double num = 3;
	 double sign = 1;
	 for(int i = 1; i <= N - 1; i++){
		piapprox = piapprox -((1/num)*(sign));
		num = num + 2;
		sign = sign *(-1);
	 }
	 System.out.println("pi acocording to Java: " + Math.PI);
	 System.out.println("pi, approximated:      " + piapprox * 4);
	}
}

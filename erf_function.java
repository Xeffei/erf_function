package numeric; // it must be your folder name, write here the folder name




public class erf_function {

	public static double result;
	
	public static double fakt(double x) // this function calculate factorial.
	{
		 double a=1;
		 
		 while (x>1){
	            a*=x;
	            x-=1;}
	        return a;}
	
	public static double erf(double x) {
		int n =0;	
		double total =0;
	while(n<200) {
			double a=Math.pow(-1, n);
			double b=Math.pow(x, 2*n+1);
			double c=fakt(n);
			double d=(2*n+1);
			total= (a*b)/(c*d);
			n++;
			result += total;
		}
		
		
		
		return 2*result/Math.sqrt(Math.PI);
	}
	
	public static void main(String[] args) {
		
		System.out.print(erf(0.3)); // 0.3 is my value , write your own

	}

}

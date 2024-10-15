package by.it_academy.less02;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x= 2;
	//	int nextNum = 1;
//		int n = 6;
		long fact=1;
		
		while (x<=17) {
		
			if (fact<fact*x) {
			fact = fact*x;
		x++;
		
		System.out.println(x+"!="+fact);
		}
		}
/*
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x);
		
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 

		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 

		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 

		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 

		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 

		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 

		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 

		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 

		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
		nextNum++; 
		x = x * nextNum;
		System.out.println(nextNum+"!= "+x); 
*/
	}

}

package by.it_academy.less02;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 101;
		int x;
		int count =0;
		
		while (n%10!=0) {
			count++;
			n = n / 10;
			System.out.println(n);
		}
		
		System.out.println("разряд числа " +count);

	}

}

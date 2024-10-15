package by.it_academy.less02;

public class Execise08 {

	public static void main(String[] args) {
		// Написать программу, которая выводит на экран первые четыре степени числа π.
		int i = 1;
		double fn;
		for (i = 1; i <= 4; i++) {
			fn = Math.pow(Math.PI, i);
			System.out.println(fn);
		}
	
	}
}

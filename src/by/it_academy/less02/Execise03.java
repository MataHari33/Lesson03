package by.it_academy.less02;

public class Execise03 {

	public static void main(String[] args) {
		// TODO 3. Составить алгоритм нахождения среднего арифметического двух чисел
		float a = 4;
		float b = 475;
		float sum = 0;
		sum = ((a + b) / 2 + (float)(a + b) % 2);
		System.out.println("Среднее арифметическое чисел " + a + " и " + b + " равно " + sum);  
	}

}

/**
 * 
 */
package by.academy.lesson3.Factorial;

/**
 * 
 */
class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 192837465;
		int numberDigits = 1;
		System.out.println(number);
		if (number != 0)
			numberDigits = (int)Math.log10(number) + 1;
		
		System.out.println(numberDigits);
		
	}

}

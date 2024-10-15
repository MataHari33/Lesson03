package by.it_academy.less02;

public class Execise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших
бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
80/n – в 1 малом бидоне
80/n+12 – молока в одном большом бидоне
(80/n+12)*m – молока в m больших бидонах
		 */
		int n = 20;
		int m = 7;
		int bigMilk = 0;
		bigMilk = (80 / n + 12) * m;
		System.out.println("В 1 малом бидоне " + 80/n + "л молока.");
		System.out.println("В "+ m + " больших бидонах " + bigMilk + "л молока.");
	}

}

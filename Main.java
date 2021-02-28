package geekbrains.homework1;

public class Main {

	public static void main(String[] args) {
		int q = 1;
		short w = 2000;
		byte e = 3;
		char r = 'h';
		long t = 10000000;
		float y = 1.0f;
		double u = 3.146676878989;
		boolean i = true;
	}
	public static float method(float a, float b, float c, float d) {
		return (a * (b + (c / d)));
	}

	public static boolean method2(int a, int b) {
		if (a + b <= 20 && a + b >= 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void method3(int a) {
		if (a < 0) {
			System.out.println("Вы передали отрицательное число");
		} else {
			System.out.println("Вы передали положительное число");
		}
	}

	public static boolean method4(int a) {
		if (a < 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void method5(String a) {
		System.out.println("Привет, " + a);
	}

	public static void method6(int a) {
		if ((a%4==0)&&(a%100!=0)||(a%400==0)) {
			System.out.println("Год " + a + " високосный");
		} else {
			System.out.println("Год " + a + " не високосный");
		}
	}
}
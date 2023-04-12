import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите вещественное х: ");
		float x = in.nextFloat();
		System.out.print("Введите целое N > 0: ");
		int N = in.nextInt();
		if (N <= 0) { System.out.print("Ошибка: Введено неправильное значение N."); return; }
		
		System.out.print(Expression(x,  N));
	}
	
	public static int Factorial(int n) {
		if (n == 0) { return 1; }
		return n * Factorial(n - 1);
	}
	
	public static float Expression(float x, int N) {
		if (N == 0) { return 1;}
		return (float) ((2 * N * x * Math.pow(-1, N)) / Factorial(2 * N) + Expression(x,  N - 1));
		
	}
}

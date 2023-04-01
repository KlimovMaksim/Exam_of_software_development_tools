import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите x: ");
		float x = in.nextFloat();
		System.out.print("Введите y: ");
		float y = in.nextFloat();
		
		if ((x >= -1) && (x <= 1) && (y >= -1) && (y <= 1)) {
			if ((x >= 0) && (x <= 1) && (y >= 0) && (y <= 1) && (x >= Math.pow(y, 2)) && (y >= Math.pow(x, 2))){
				System.out.print("Истина");
			}
			else if ((x >= -1) && (x <= 0) && (y >= 0) && (y <= 1) && (y >= Math.pow(x, 2)) && (x <= -Math.pow(y, 2))) {
				System.out.print("Истина");
			}
			else if ((x >= -1) && (x <= 0) && (y >= -1) && (y <= 0) && (y <= -Math.pow(x, 2)) && (x <= Math.pow(y, 2))) {
				System.out.print("Истина");
			}
			else if ((x >= 0) && (x <= 1) && (y >= -1) && (y <= 0) && (y <= -Math.pow(x, 2)) && (x >= -Math.pow(y, 2))) {
				System.out.print("Истина");
			}
		}
		else {
			System.out.print("Ложь");
		}
	}
}

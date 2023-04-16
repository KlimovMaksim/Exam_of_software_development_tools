public class Task_3 {
	public static void main(String[] args) {
		int[] binArray = new int[] { 111, 1101, 101011, 1110101 };
		int[] fiveArray = new int[binArray.length];
		
		for (int i = 0; i < binArray.length; i++) {
			fiveArray[i] = convTo(convFrom(binArray[i], 2, 0), 5);
		}
		for (int i : fiveArray) { System.out.println(i); }
	}

	// перевод number в base системы из 10-ой
	public static int convTo(int number, int base) {
		if (number < base) { return number; }
		return number % base + convTo(number / base, base) * 10;
	}

	// перевод number из системы base в 10-ую
	public static int convFrom(int number, int base, int firstPosition) { 
		if(number == 0) {return 0;}
		return (int) ((number % 10) * Math.pow(base, firstPosition) + convFrom(number / 10, base, ++firstPosition)); }
	}

public class Task5 {
	
	public static void printValues(byte a, byte b) {
		System.out.println("A - " + a % 17);
		System.out.println("B - " + b % 17);
		System.out.println();
	}

	public static void main(String[] args) {
		byte robotA = 1;
		byte robotB = 17;
		for (;;) {
			printValues(robotA, robotB);
			robotA += 4;
			if (robotA % 17 == robotB % 17) {
				printValues(robotA, robotB);
				break;
			}
			robotB += 3;
		}
	}
}

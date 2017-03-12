public class Task1 {
	
	public static int getNumber(int x, int y, int z) {
		return x * 49 + y * 7 + z;
	}

	public static void main(String[] args) {
		for (int x = 1; x < 7; ++x)
			for (int y = 1; y < 7; ++y)
				for (int z = 1; z < 7; ++z)
					if (getNumber(x, y, y) - getNumber(y, y, x) == getNumber(z, x, z)) {
						System.out.println("X = " + x + ", " + "Y = " + y + ", " + "Z = " + z);
					}
	}
}

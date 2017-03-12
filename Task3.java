public class Task3 {
	
	public static String foo(int x) {
		String res = "";
		int[] a = new int[40];
		int t = 0;
		int y;

		while (x != 0) {
			y = x % 10;

			while (y != 0) {
				t = t + 1;
				a[t] = y % 2;
				y = y / 2;
			}

			if (t % 4 != 0) {
				t = t + 4 - (t % 4);
			}

			x = x / 10;
		}

		while (t != 0) {
			res += String.valueOf(a[t]);
			t = t - 1;
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(foo(2837195));
	}
}

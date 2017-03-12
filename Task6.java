import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Task6 {

	public static boolean check(List<Integer> list) {
		for (Integer i : list) {
			if (i < 0 || (i > 0 && i < 10) || i >= 100)
				return false;
		}
		return true;
	}

	public static int quad_digits(int x) {
		int res = 0;
		while (x > 0) {
			res += Math.pow((x % 10), 2);
			x /= 10;
		}
		return res;
	}

	public static boolean filter(int x) {
		int res = 0;
		for (int i = 0; i < 4; ++i) {
			res = quad_digits(x);
			x = res;
		}
		return res == 85;
	}

	public static List<Integer> foo(int w) {
		List<Integer> a = new ArrayList<Integer>(Collections.nCopies(1, 0));
		int s;
		int c;
		int k = 1;
		a.add(k, w);

		while (w != 85) {
			s = 0;
			while (w != 0) {
				c = w % 10;
				s = s + c * c;
				w = w / 10;
			}
			w = s;
			k = k + 1;
			a.add(k, w);
		}

		return a;
	}

	public static void main(String[] args) {
		for (int i = 10; i < 100; ++i) {
			if (filter(i)) {
				List<Integer> res = foo(i);
				if (check(res)) {
					System.out.println("Number: " + i + " //// " + "Array: " + res);
				}
			}
		}
	}
}

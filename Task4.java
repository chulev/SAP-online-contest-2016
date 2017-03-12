public class Task4 {
	
	public static StringBuilder foo() {
		StringBuilder res = new StringBuilder();
		for (int i = 1; i <= 65536; ++i) {
			res.append(Integer.toBinaryString(i));
		}
		return res;
	}

	public static void main(String[] args) {
		StringBuilder x = foo();
		System.out.println(x.toString().indexOf("111111111") + 1);
	}
}

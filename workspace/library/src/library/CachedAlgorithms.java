package library;

public class CachedAlgorithms {
	public static int eulerFunction(int n) {
		int result = n;
		for (int i = 2; i * i <= n; ++i) {
			if (n % i == 0) {
				while (n % i == 0) {
					n /= i;
				}
				result -= result / i;
			}
		}
		if (n > 1) {
			result -= result / n;
		}
		return result;
	}

	public static long pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		if (a == 2) {
			return 1 << b;
		}
		long res = 1;
		while (b != 0) {
			if ((b & 1) == 1) {
				res *= a;
			}
			a *= a;
			b >>= 1;
		}
		return res;
	}

	
	
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			System.out.println(pow(i, 8));
		}
	}
}

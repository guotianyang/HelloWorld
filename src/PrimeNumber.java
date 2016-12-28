public class PrimeNumber {

	public static void main(String[] args) {

		boolean bool;
		for (int i = 1; i < 100; i++) {
			bool = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					bool = false;
				}
			}
			if (bool == true)
				System.out.print(i + " ");
		}

	}
}
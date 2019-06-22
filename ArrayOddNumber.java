package trendyolTest;

public class ArrayOddNumber {

	public int solution() {
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };

		int son = 0;

		boolean correct = false;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				continue;
			}
			int j = 0;
			correct = true;
			while (j < A.length) {
				if (A[j] != 0 &&  A[j] == A[i] && i != j) {
					A[i] = A[j] = 0;
					correct = false;
					break;
				}
				j++;
				
			}
			if (correct == true) {
				son = A[i];
			}
		}
		return son;

		// return default

		/**
		 * for (int i = 0; i < A.length; i++) { if (A[i] == 0) continue; boolean f =
		 * false; for (int j = i + 1; j < A.length; j++) { if (A[j] == 0) continue; if
		 * (A[i] == A[j]) { A[i] = A[j] = 0; f = true; } } if (f == false) return A[i];
		 * } return 0;
		 */

	}

	public static void main(String[] args) {
		ArrayOddNumber oddNumber = new ArrayOddNumber();
		System.out.println(oddNumber.solution());
	}

}

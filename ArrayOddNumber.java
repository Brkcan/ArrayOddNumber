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
	}

	public static void main(String[] args) {
		ArrayOddNumber oddNumber = new ArrayOddNumber();
		System.out.println(oddNumber.solution());
	}

}

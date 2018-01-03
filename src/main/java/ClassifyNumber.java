public class ClassifyNumber {

	// 1. Write a method isEven, that takes an int as a parameter and returns true
	// if the int is even, false if it is odd.
	public static boolean isEven(int i) {
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 2. Write a method called isEvenAndPositive, that takes an int as a parameter
	// and returns true if the int is even AND positive, anything else should return false.
	// 0 is NOT considered positive in this situation.

	public static boolean isEvenAndPositive(int i) {
		if ((i % 2 == 0) && i > 0) {
			return true;
		} else {
			return false;
		}
	}
}

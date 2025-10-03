public class PracticeProblem {

	public static void main(String args[]) {
		int[] q1Arry = {2,3,4,5,6};
		boolean returned_value = validIndex(-2,q1Arry); // returns false
		System.out.println(returned_value); 

		int returned_value_2 = divide(2, 0); // returns 0
		System.out.println(returned_value_2);

		int convertedToInt = safeConvertStringtoInt("this is will not convert to an int and return 0");
		System.out.println(convertedToInt);
	}

	public static boolean validIndex(int _index, int[] arr){
		try {
			int getValue = arr[_index];
		}

		catch (ArrayIndexOutOfBoundsException e){
			return false;
		}

		return true;
	}

	public static int divide(int int_1, int int_2){
		try {
			int result = int_1/int_2;

			return result;
		}

		catch (ArithmeticException aE){
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String string_value){
		try {
			int toInt = Integer.parseInt(string_value);

			return toInt;
		}

		catch (NumberFormatException nFE){
			return 0;
		}
	}

}

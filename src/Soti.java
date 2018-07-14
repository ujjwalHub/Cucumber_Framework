
public class Soti {

	public static void getReverseString(String input) {
		String[] reverseWords = input.split(" ");
		int reverseWordsLenth = reverseWords.length;
		StringBuilder finalReverse = new StringBuilder();
		Boolean isEmpty = true;
		while (isEmpty) {
			for (int word = reverseWordsLenth - 1; word >= 0; word--) {
				finalReverse.append(reverseWords[word] + " ");
			}
			System.out.println(finalReverse);
			finalReverse.setLength(0);
			reverseWordsLenth--;
			if (reverseWordsLenth == 0) {
				isEmpty = false;
			}
		}
	}

	public static void swapTwoStringValues(String value1, String value2) {
		String str1 = value1;
		String str2 = value2;
		System.out.println("Before Swap the value of str1 = " + str1 + " and str2 = " + str2);
		str2 = str1 + "," + str2;
		str1 = str2.substring(str2.indexOf(",") + 1, str2.length());
		str2 = str2.substring(0, str2.indexOf(","));
		System.out.println("After Swap the value of str1 = " + str1 + " and str2 = " + str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getReverseString("My Name Is Ujjwal");
		swapTwoStringValues("Ujjwal", "Srivastav");

	}

}

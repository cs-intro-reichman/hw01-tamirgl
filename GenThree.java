/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int rangeStart, rangeEnd;
		if (a < b) {
			rangeStart = a;
			rangeEnd = b;
		}
		else {
			rangeStart = b;
			rangeEnd = a;
		}
		int rangeDiff = rangeEnd - rangeStart;

		int randInt1 = (int)(rangeStart + Math.random() * rangeDiff);
		int randInt2 = (int)(rangeStart + Math.random() * rangeDiff);
		int randInt3 = (int)(rangeStart + Math.random() * rangeDiff);

		int minimalGeneratedNumber = Math.min(Math.min(randInt1, randInt2), randInt3);

		System.out.println(randInt1);
        System.out.println(randInt2);
        System.out.println(randInt3);
        System.out.println("The minimal generated number was " + minimalGeneratedNumber);
	}
}

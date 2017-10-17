import java.time.*;
import java.util.*;

public class Homework06Driver {

	public static void main(String[] args) {

		// I recommend starting with a small array to test that your methods work properly.
		// You won't see a different in running time for small arrays.
		// Once you know your methods work, increase the size to see the difference in run time!
	
		/* 	NOTE! if you don't have Java 8, and thus cannot access the java.time package,
		 * use this code to measure time instead:
		 * 		
		Date current = new Date();
		long startTime = current.getTime();
		long stopTime = current.getTime();
		long elapsedTime = stopTime - startTime;
		 * 
		 */
	
	
		
		int arraySize = 10;
		int[] numbers = new int[arraySize];

		Instant start = Instant.now();
		fillWithUniqueN(numbers);
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("The array is: " + Arrays.toString(numbers));
		System.out.println("The linear method took " + timeElapsed.toMillis() + " milliseconds.");

		start = Instant.now();
		fillWithUniqueN2(numbers);
		end = Instant.now();
		timeElapsed = Duration.between(start, end);
		System.out.println("The array is: " + Arrays.toString(numbers));
		System.out.println("The quadratic method took " + timeElapsed.toMillis() + " milliseconds.");
		
		/* testing extra credit 
		int[] posNegNumbers = new int[arraySize];
		fillWithPosNeg(posNegNumbers);
		System.out.println(Arrays.toString(posNegNumbers));
		arrangeNegBeforePositive(posNegNumbers);
		System.out.println(Arrays.toString(posNegNumbers));
		*/

	}

	// fills the array with UNIQUE values from 0 to 10n; linear time
	private static void fillWithUniqueN(int[] numbers) {

	}

	// fills the array with UNIQUE values from 0 to 10n; quadratic time (or worse)
	private static void fillWithUniqueN2(int[] numbers) {

	}

	public static void arrangeNegBeforePositive(int[] array) {
		// YOUR CODE HERE FOR EXTRA CREDIT
	}

	private static void fillWithPosNeg(int[] numbers) {
		Random generator = new Random();
		for (int i = 0; i < numbers.length; i++) {
			int number = generator.nextInt(101) - 50; // will fill with a random number in the range -50 to 50
			if (number != 0) {
				numbers[i] = number;
			} else {
				i--;
			}
		}
	}

}

package StreamAPI;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOfOccurrencesOfCharsOfString {

	public static void main(String[] args) {

		String str = new String("Hello");

		//
		Map<Character, Long> characterCount = str.chars()// String into IntStream of ASCII values of its characters
				.mapToObj(c -> (char) c) // map each ASCII value to its corresponding character creating
											// Stream<Character>
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Collects the characters
																								// into a Map where the
																								// key is the character
																								// and the value is the
																								// count of its
																								// occurrence

		//
		characterCount.forEach((character, count) -> System.out.println(character + " : " + count));
	}

}

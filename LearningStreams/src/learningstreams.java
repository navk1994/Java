import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class learningstreams {

	public static void main(String[] args) {
		// printEvenNumbers();
		// printNumbersMoreThan10();
		// printHighestNumber();
		// printLowestNumber();
		uniqueNumber();
	}

	static void printEvenNumbers() {
		List<Integer> numbersList = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		numbersList.stream().filter(i -> (i % 2 == 0)).forEach(System.out::println);
	}

	static void printNumbersMoreThan10() {
		List<Integer> numbersList = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		numbersList.stream().filter(i -> (i > 10)).forEach(System.out::println);
	}

	static void printHighestNumber() {
		List<Integer> numbersList = Arrays.asList(3, 2, 2, 400, 500, 3, 5, 9, 8, 12);

		System.out.println(numbersList.stream().reduce(Math::max).get());

	}

	static void printLowestNumber() {
		List<Integer> numbersList = Arrays.asList(3, 2, 2, 400, 500, 3, 5, 9, 8, 12, 1);

		System.out.println(numbersList.stream().reduce(Math::min).get());

	}

	static void sqrNumberPushToNewArray() {
		List<Integer> numbersList = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);
		List<Integer> secondList = numbersList.stream().map(i -> (i * i)).collect(Collectors.toList());

		System.out.println(secondList);

	}

	static void uniqueNumber() {
		List<Integer> numbersList = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		numbersList.stream().distinct().forEach(System.out::println);
	}
}

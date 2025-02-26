import java.util.*;

public class IntegerSumAutoboxing {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> integerList = new ArrayList<>();

        // Parsing strings into Integer objects (autoboxing)
        for (String num : numbers) {
            integerList.add(Integer.parseInt(num));
        }

        // Calculating sum (unboxing)
        int sum = 0;
        for (Integer num : integerList) {
            sum += num; // Unboxing happens here
        }

        System.out.println("Sum of integers: " + sum);
    }
}

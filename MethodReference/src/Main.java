import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Reference to a static method
        Function<Integer, String> intToString = String::valueOf;
        System.out.println(intToString.apply(123)); // Output: "123"

        // Reference to an instance method of a particular object
        String greeting = "Hello";
        Function<String, Integer> strLength = String::length;
        System.out.println(strLength.apply(greeting )); // Output: 5

        // Reference to an instance method of an arbitrary object of a particular type
        Function<String, Integer> strHashCode = String::hashCode;
        System.out.println(strHashCode.apply("Hello")); // Output: hash code of "Hello"

        // Reference to a constructor
        Function<Integer, StringBuilder> stringBuilderConstructor = StringBuilder::new;
        System.out.println(stringBuilderConstructor.apply(16)); // Output: empty StringBuilder with initial capacity of 16
    }
}

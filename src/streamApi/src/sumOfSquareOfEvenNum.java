import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/*Given a list of integers, write a method to return the sum of squares of all even numbers in the list.

Input:

A list of integers
Output:

An integer representing the sum of squares of even numbers
Example:
Input: [1, 2, 3, 4, 5, 6]
Output: 56

Explanation:
The even numbers are 2, 4, and 6. The sum of their squares is 4 + 16 + 36 = 56.*/




public class sumOfSquareOfEvenNum {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        try {
            int res = sumofsquareofevennum(input);
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    private static int sumofsquareofevennum(List<Integer> input) throws NoSuchElementException {
        // Approach 1
//        return input.stream()
//                .filter(ele -> ((ele&1)==0))
//                .map(ele -> ele*ele)
//                .reduce(0,Integer::sum);
        ///approach 2
        return input.stream()
                .filter(ele -> ((ele&1)==0))
                .map(ele -> ele*ele)
                .reduce(0,CustomMathsClass::sum);

    }
}



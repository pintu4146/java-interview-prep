
/*
Write a Java stream pipeline to find the square of each element in a list of integers
and then filter out the elements that are greater than 100. The method signature should be:

java

public static List<Integer> squareAndFilter(List<Integer> numbers) {
    // Your implementation goes here
}

Example:

Input: [5, 10, 15, 20, 25]
Output: [15, 25, 100]
Write the implementation for the squareAndFilter method using Java streams.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class squareAndFilter {
    public static void main(String[] pin2){
        int[] input = {5, 10, 15, 20, 25};
        int threshold = 100;
        List<Integer> res = squareAndFilter(input, threshold);
        System.out.println(res);


    }
    public static List<Integer> squareAndFilter(int[] numbers, int threshold) {
//        List<Integer> rtn = new ArrayList<>();
//        for(int ele: numbers){
//           if ((ele*ele) > threshold){rtn.add(ele);}
//        }
//        return rtn;
       return Arrays.stream(numbers)
               .boxed() // ask why boxed it & can we skip it. if yes think cases.
               .map(ele -> ele*ele)
               .filter(ele -> ele > threshold) // ask question to yourself this ele is squared element or original ?
               .map(ele -> (int)Math.sqrt(ele)) //think why not .map(Math::sqrt)
               .collect(Collectors.toList());

    }
}

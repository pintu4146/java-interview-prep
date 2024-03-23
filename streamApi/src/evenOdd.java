
/*
Write a Java program that filters even numbers
from a given list of integers using streams.
Implement a method named filterEvenNumbers that takes a list of integers as input
and returns a new list containing only the even numbers from the original list.
Your implementation should use Java streams.
Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Output: [2, 4, 6, 8, 10]

*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenOdd {
    public static void main(String[] args) {
       int[] Input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> object =  filterEvenNumbers(Input);
        System.out.println(object);


    }

    private static List<Integer> filterEvenNumbers(int[] input) {

//        for(int ele: input){
//            if((ele&1)==1){
//                System.out.println("odd");
//            }
//            else{
//                System.out.println("even");
//            }
//        }

        return Arrays.stream(input).filter(x -> ((x&1)==0))
                .boxed().collect(Collectors.toList());
    }
}

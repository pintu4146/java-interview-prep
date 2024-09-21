/*
* Suppose you have a list of lists of integers, and you want to flatten
* it into a single list of integers.
* Write a Java method that takes a List<List<Integer>> as input
* and returns a flattened list using the flatMap operation. The method signature could be:


public List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {
    // Your implementation here
}

For example, given the input [[1, 2, 3], [4, 5], [6, 7, 8]], the method should return [1, 2, 3, 4, 5, 6, 7, 8].*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class flattenListOfLists {
    public static List<Integer> mflattenListOfLists(List<List<Integer>> listOfLists) {
//        List<Integer> rtn = new ArrayList<>();
//        for(List<Integer> one : listOfLists){
//            for(int many: one){
//                rtn.add(many);
//
//            }
//        }
//        return rtn;
        return listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        List<List<Integer>> input =  Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> res = mflattenListOfLists(input);
        System.out.println(res);

    }
}

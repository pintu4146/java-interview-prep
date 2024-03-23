
/*
Write a Java method that takes a list of strings
and returns a new list containing only the strings
that start with the letter "A". The method signature should be:


public List<String> filterStringsStartingWithA(List<String> strings) {
}

Make sure to handle cases where the input list is empty or contains null elements.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class filterStringsStartingWithA {
    public static  List<String> mFilterStringsStartingWithA(List<String> strings) {
//        List<String> rtn = new ArrayList<>();
//        for(String ele : strings){
//            if(ele.startsWith("A")){rtn.add(ele);}
//
//        }
//        return rtn;
        return strings.stream()  //nothing much we can think like why not Arrays.stream(strings)
                .filter(ele -> ele.startsWith("A"))
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Apple", "Banana", "Orange", "Apricot", "Grapes", "Avocado");
        List<String> res = mFilterStringsStartingWithA(input);
        System.out.println(res);


    }

}

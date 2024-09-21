import java.util.*;

import utils.Utils;

public class findingSecondElementFroList {
    public int usingSorting(ArrayList<Integer> arrayList){
        if(arrayList.size() == 1) {
            System.out.println(arrayList.getFirst());
            return arrayList.getFirst();
        }
        else{
            arrayList.sort(Collections.reverseOrder());
            System.out.println(arrayList.get(1));// since sorted in reverse 0->largest, 1->secondLarget
            return arrayList.get(1);
        }
    }
 // find second largest nu fro list
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of test case");
        int numTestCase = sc.nextInt();
        ArrayList<Integer> arrayList = Utils.arrayRelatedTestCase(numTestCase, Integer.class);
        // using sorting
        System.out.println("using sorting");
        findingSecondElementFroList obj = new findingSecondElementFroList();
       int secLargeUsingSorting =  obj.usingSorting(arrayList);
        System.out.println(secLargeUsingSorting);


        // using stream
        System.out.println("using Stream");
        int secLargeUsingStrem = obj.usingStream(arrayList);
        System.out.println(secLargeUsingStrem);






    }

    private int usingStream(ArrayList<Integer> arrayList) {
       Optional<Integer> largest =  arrayList.stream().max(Comparator.naturalOrder());

        return arrayList.stream().filter(ele -> ele!= largest.get()).max(Comparator.naturalOrder()).get();
    }
}

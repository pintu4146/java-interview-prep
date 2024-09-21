package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {

    // Generic method to handle multiple types dynamically
    public static <T> ArrayList<T> arrayRelatedTestCase(int numOfTestCases, Class<T> type) {
        Scanner sc = new Scanner(System.in);
        ArrayList<T> arrayList = new ArrayList<>();
        while (numOfTestCases > 0) {
            System.out.println("Number of elements in the list:");
            int numOfElements = sc.nextInt();

            for (int i = 0; i < numOfElements; i++) {
                System.out.println(i == 0 ? "Enter the first element:" : "Enter the next element:");

                // Handle input based on the provided type
                if (type == Integer.class) {
                    arrayList.add(type.cast(sc.nextInt()));  // Handling Integer input
                } else if (type == String.class) {
                    arrayList.add(type.cast(sc.next()));     // Handling String input
                } else {
                    System.out.println("Unsupported type");
                    return arrayList;
                }
            }

            numOfTestCases--;
        }

        return arrayList;
}}

package oop.q2;

import java.util.*;

/**
 * ListTransformer transforms values from list1 and list2 into list3
 * based on a given index mapping pattern.
 *
 * For each index i, list3[i] is assigned the value list2[mapping[i]].
 *
 * The program uses  predefined lists and mapping according to
 * the given animation example. but it can be adapted to other values .
 */
public class ListTransformer {

    public static void main(String[] args) {
        // Predefined list1 with integer values
        List<Integer> list1 = Arrays.asList(3, 8, 7, 5, 8, 6, 9, 2, 7, 3, 3, 4, 4);

        
        List<String> list2 = Arrays.asList(
            "8ciN", "Geb", "tkVa", "5WC", "6I87", "MwF", "51Hi", "EiXR", "S2fj",
            "KDw", "SUG", "mvTe", "VGSSD", "TY9Q", "dyDN", "099", "pkA", "kyrk"
        );

        
        int[] mapping = {5, 15, 13, 9, 15, 11, 17, 3, 13, 5, 5, 7, 7};

       
        System.out.println("List1 (Integers):");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Index " + i + ": " + list1.get(i));
        }
        System.out.println();

    
        System.out.println("List2 (Strings):");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("Index " + i + ": " + list2.get(i));
        }
        System.out.println();

        
        List<String> list3 = new ArrayList<>();

        
        for (int i = 0; i < mapping.length; i++) {
            int idx = mapping[i];
            if (idx >= 0 && idx < list2.size()) {
                list3.add(list2.get(idx));
            } else {
                list3.add("InvalidIndex");
            }
        }

        
        System.out.println("List3 (Mapped Strings):");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println("Index " + i + ": " + list3.get(i));
        }
    }
}


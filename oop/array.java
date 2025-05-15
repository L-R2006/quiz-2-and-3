import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {

    public static void main(String[] args) {
        int[] array1 = {23, 45, 67, 89, 12, 34};
        int[] array2 = new int[array1.length];
        
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
            
        
        System.out.println("array1:");
        System.out.println(Arrays.toString(array1));
        
        System.out.println("array2:");
        System.out.println(Arrays.toString(array2));


    }
}



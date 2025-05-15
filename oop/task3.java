import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

       
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (i % 2 == 1) {  
                list1.remove(i);
            }
        }

        
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (i % 2 == 1) {  
                list1.remove(i);
            }
        }

        
        System.out.println("list1: 10, 20, 30, 40, 50, 60, 70" );
        System.out.println("list2: 10, 30, 50, 70");
        System.out.println("list3: " + list1);
        //System.out.println("list4" + list1);
    }
}



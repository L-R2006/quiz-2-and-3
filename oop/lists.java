import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class lists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));  
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 1) {  
                list2.add(list1.get(i));
            }
        }
        
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (i % 2 == 1) {  
                list1.remove(i);
            }
        }
        System.out.println("list1: 10, 20, 30, 40, 50, 60, 70" );
        System.out.println("list2:" + list2);
        System.out.println("moved elements: " + list2);
       
}
}





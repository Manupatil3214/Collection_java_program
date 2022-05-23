import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting {
    // Sorting in ArrayList
    // there are two type
    // Ascending And Descending

    public static void main(String agrs[]) {

        ArrayList<Integer> str1 = new ArrayList<>();
        str1.add(10);
        str1.add(30);
        str1.add(20);
        str1.add(50);
        str1.add(100);
        System.out.println("Befor Sorting Arraylist : " + str1);
        // Ascending {Collections.sort(alist); => Default Ascending}
        Collections.sort(str1);
        System.out.println("After Sorting Arraylist : " + str1);

        // Descending { Collections.sort(alist,Collections.reversOrder()); => For
        // Descending Order Syntax}

        Collections.sort(str1, Collections.reverseOrder());
        System.out.println("After Descending Sorting Arraylist : " + str1);

    }

}

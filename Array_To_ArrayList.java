
import java.util.Arrays;
import java.util.ArrayList;

public class Array_To_ArrayList {
    public static void main(String arg[]) {
        // Array TO ArrayList
        String[] arr = { "A", "B", "C", "D", "E" };

        for (String s : arr)
            System.out.println(s);
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(al);
        System.out.println("ArrayList:" + al);
        System.out.println("Array length:" + arr.length);
        // ArrayList<String> a1 = new ArrayList<>();
        // List<java.lang.String> al = Arrays.asList(arr);

    }

}

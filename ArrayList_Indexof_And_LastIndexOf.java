import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Indexof_And_LastIndexOf {
    public static void main(String agrs[]) {
        ArrayList<Integer> str = new ArrayList<>();
        str.add(10);
        str.add(1000);
        str.add(45);
        str.add(134);
        str.add(45);
        str.add(12);
        System.out.println("ArrayList : " + str);
        // indexOf => return particuler starting index element list
        System.out.println("indexOf () : " + str.indexOf(45));

        // lastIndexOf => return particuler index element list
        System.out.println("lastIndexOf () : " + str.lastIndexOf(45));
        Collections.sort(str);
        System.out.println("After Ascending ArrayList : " + str);

        // indexOf => return particuler starting index element list
        System.out.println("indexOf () : " + str.indexOf(45));

        // lastIndexOf => return particuler index element list
        System.out.println("lastIndexOf () : " + str.lastIndexOf(45));
    }
}

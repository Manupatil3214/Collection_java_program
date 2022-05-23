import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Swap {
    public static void main(String args[]) {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("a");
        str1.add("b");
        str1.add("j");
        str1.add("p");
        str1.add("z");
        System.out.println("Befor Swappin ArrayList : " + str1);
        Collections.swap(str1, 1, 4);
        System.out.println("After Swappin ArrayList : " + str1);

    }
}

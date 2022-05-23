import java.util.ArrayList;
import java.util.*;

public class ArrayList_CloneMethod {
    public static void main(String args[]) {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("a");
        str1.add("b");
        str1.add("j");
        str1.add("p");
        str1.add("z");
        System.out.println("ArrayList : " + str1);
        ArrayList<String> str2 = (ArrayList<String>) str1.clone();
        // ArrayList<String> str2 = (ArrayList<String>)str1.clone();
        System.out.println("After clone ArrayList : " + str2);
        str1.add("q");
        str1.add("x");
        System.out.println("after changes ArrayList : " + str1);
        System.out.println("After clone ArrayList : " + str2);

    }

}

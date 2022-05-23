import java.util.ArrayList;

public class ArrayList_To_String {
    public static void main(String[] arg) {
        // ArrayList to String

        ArrayList<String> str1 = new ArrayList<>();
        str1.add("A");
        str1.add("b");
        str1.add("c");
        str1.add("d");
        str1.add("e");
        System.out.println(str1);
        for (String n : str1)
            System.out.println("ArrayList Index:" + n);

        // toString() =>ArrayList To Convert String
        String m = str1.toString();
        System.out.println("ArrayList To String" + m);

        // check the size of arraylist
        System.out.println("Arraylist size : " + str1.size());

        // check the size of arraylist
        System.out.println("String size : " + m.length());

    }
}

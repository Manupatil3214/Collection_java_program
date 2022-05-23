import java.util.ArrayList;

public class ArrayList_subList {
    public static void main(String arg[]) {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("a");
        str1.add("b");
        str1.add("j");
        str1.add("p");
        str1.add("z");
        System.out.println("orignal list : " + str1);
        ArrayList<String> str2 = new ArrayList<>(str1.subList(0, 3));

        System.out.println("subList Create : " + str2);
        ArrayList<String> str3 = new ArrayList<>(str1.subList(1, 4));

        System.out.println("subList Create : " + str3);
        ArrayList<String> str4 = new ArrayList<>(str1.subList(1, 5));

        System.out.println("subList Create : " + str4);

    }
}

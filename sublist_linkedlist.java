import java.util.LinkedList;
import java.util.List;

public class sublist_linkedlist {
    public static void main(String agrs[]) {
        LinkedList<String> str1 = new LinkedList<>();
        str1.add("a");
        str1.add("b");
        str1.add("j");
        str1.add("p");
        str1.add("z");
        System.out.println("LinkedList : " + str1);

        // sublist()=>use to create sub list of index
        // LinkedList<String> link = new LinkedList<>();
        List sublist = str1.subList(2, 5);// LinkedList use to subList() : [j, p, z]
        System.out.println("LinkedList use to subList() : " + sublist);

        // when you change in sublist then automatically change in main linkedlist

        System.out.println("Remove use to change in subList() : " + sublist.remove(0));
        System.out.println("After change subList() : " + sublist);
        System.out.println("change in subList() then LinkedList change Show : " + str1);

        // when adding in sublist
        sublist.add(1, "x");
        System.out.println("Adding use to change in subList() : " + sublist);
        System.out.println("After change subList() : " + sublist);
        System.out.println("change in subList() then LinkedList change Show : " + str1);
    }

}

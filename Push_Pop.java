
import java.util.LinkedList;

public class Push_Pop {
    public static void main(String agrs[]) {
        LinkedList<String> str1 = new LinkedList<>();
        str1.add("a");
        str1.add("b");
        str1.add("j");
        str1.add("p");
        str1.add("z");
        System.out.println("LinkedList : " + str1);

        // Push() => use to add element to front
        str1.push("x");
        str1.push("t");
        str1.push("e");
        System.out.println("use of push() : " + str1);

        // Pop() => use to remove element to front
        str1.pop();
        System.out.println("use of pop() : " + str1);
    }
}

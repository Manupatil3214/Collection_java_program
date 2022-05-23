
import java.util.LinkedList;

public class all_method_poll_linkedlist {
    public static void main(String agrs[]) {
        LinkedList<String> str1 = new LinkedList<>();
        str1.add("a");
        str1.add("b");
        str1.add("j");
        str1.add("p");
        str1.add("z");
        System.out.println("LinkedList : " + str1);

        // use poll() or pollFirst() => the print first index value after print
        // they remove first index value
        // str1.poll();
        System.out.println("Poll() LinkedList : " + str1.poll());

        // str1.pollFirst();
        System.out.println("PollFirst() LinkedList : " + str1.pollFirst());

        // use pollLast() => the print LAST index value after print
        // they remove LAST index value

        // str1.pollLast();
        System.out.println("PollLast() LinkedList : " + str1.pollLast());

    }

}

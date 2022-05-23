import java.util.LinkedList;

public class All_Method_peek_linkedlist {
    public static void main(String agrs[]) {
        LinkedList<String> str1 = new LinkedList<>();
        str1.add("a");
        str1.add("b");
        str1.add("j");
        str1.add("p");
        str1.add("z");
        System.out.println("LinkedList : " + str1);

        // peek() => Use to retrive but doesnot remove;

        System.out.println("LinkedList to use peek() => : " + str1.peek());

        // peekFirst() => Use to retrive First element but doesnot remove;

        System.out.println("LinkedList to usepeekFirst() => : " + str1.peekFirst());

        // peekLast() => Use to retrive last element but doesnot remove;

        System.out.println("LinkedList to use peekLast() => : " + str1.peekLast());

    }

}

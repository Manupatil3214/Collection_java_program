import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Array_Dequeue {

    public static void main(String agrs[]) {
        Deque<Integer> d1 = new ArrayDeque<>();

        // addFirst()=>

        d1.addFirst(1);
        d1.addFirst(13);
        d1.addFirst(12);
        d1.addFirst(18);
        System.out.println(" Use addFirst():" + d1);
        System.out.println(" DequeList:" + d1);

        // addLast()=>

        d1.addLast(100);
        d1.addLast(30);

        System.out.println(" Use addLast():" + d1);
        System.out.println(" DequeList:" + d1);

        // OfferLast()=>

        d1.offerLast(20);
        d1.offerLast(30);

        System.out.println(" Use offerLast():" + d1);
        System.out.println(" DequeList:" + d1);

        // offerfirst()=>
        d1.offerFirst(56);
        d1.offerFirst(180);
        System.out.println(" Use offerFirst():" + d1);
        System.out.println(" DequeList:" + d1);

        // getFirst()=>

        System.out.println(" Use getFirst():" + d1.getFirst());
        System.out.println(" DequeList:" + d1);

        // getlast=>
        System.out.println(" Use getlast():" + d1.getLast());
        System.out.println(" DequeList:" + d1);

        // peekFirst()=>
        System.out.println(" Use peekFirst():" + d1.peekFirst());
        System.out.println(" DequeList:" + d1);

        // peekLast()=>
        System.out.println(" Use peekLast():" + d1.peekLast());
        System.out.println(" DequeList:" + d1);

        // pollFirst()=>
        System.out.println(" Use pollFirst():" + d1.pollFirst());
        System.out.println(" DequeList:" + d1);

        // pollLast()=>
        System.out.println(" Use pollLast():" + d1.pollLast());
        System.out.println(" DequeList:" + d1);

        // Iterator()=>
        Iterator<Integer> t1 = d1.iterator();
        while (t1.hasNext()) {
            System.out.println(t1.next());
        }

        // removeFirst=>

        System.out.println(" Use removeFirst():" + d1.removeFirst());
        System.out.println(" DequeList:" + d1);

        // removeLast()=>
        System.out.println(" Use removeLast():" + d1.removeLast());
        System.out.println(" DequeList:" + d1);
    }

}

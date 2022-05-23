import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueue1 {
    public static void main(String args[]) {

        PriorityQueue<Integer> str = new PriorityQueue<>();

        // add()=> add elements but when capacity is full then add() give to exception;
        str.add(10);
        str.add(34);
        str.add(122);
        str.add(156);
        str.add(99);
        str.add(44);

        System.out.println(" PriorityQueue LIST use add() =>" + str);

        // offer()=> add elements but when capacity is full then offer() give to null;

        str.offer(1);
        str.offer(299);
        str.offer(4);

        System.out.println(" PriorityQueue LIST use offer() =>" + str);

        // poll,remove , peek and element
        System.out.println(" PriorityQueue LIST use Remove() =>" + str.remove());
        System.out.println(" PriorityQueue LIST after use  =>" + str);
        System.out.println(" PriorityQueue LIST use poll() =>" + str.poll());
        System.out.println(" PriorityQueue LIST after use =>" + str);
        System.out.println(" PriorityQueue LIST use peek() =>" + str.peek());
        System.out.println(" PriorityQueue LIST after use  =>" + str);

        Iterator<Integer> p1 = str.iterator();
        while (p1.hasNext()) {
            System.out.println(" PriorityQueue LIST use to Iterator  =>" + p1.next());

        }

    }

}

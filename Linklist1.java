import java.util.LinkedList;

public class Linklist1 {
    public static void main(String args[]) {
        LinkedList<Integer> link = new LinkedList<>();
        // add() to adding element;

        link.add(10);
        link.add(14);
        link.add(12);
        link.add(100);
        link.add(23);
        System.out.println("Add() using => " + link);

        // add(Index,Element) to adding to index number value on linkedlist;
        link.add(3, 65);
        link.add(4, 44);
        System.out.println("Add(index,element) using => " + link);

        // addFirst() to use value add to first position;
        link.addFirst(99);
        link.addFirst(230);
        System.out.println("addFirst() using => " + link);

        // addLast() to use value add to last position;
        link.addLast(66);
        link.addLast(87);
        System.out.println("addLast() using => " + link);

        // addAll() use to copy fisrt linkedlist to another linkedlist;
        LinkedList<Integer> link1 = new LinkedList<>();
        link1.addAll(link);
        System.out.println("addAll() using => " + link1);
        // size() use to meger size
        System.out.println("Link size() using => " + link.size());
        System.out.println("Link1 size() using => " + link1.size());

        // get() use to get return value

        System.out.println("get() using link => " + link.get(5));

        System.out.println("get() using link1 => " + link1.get(4));

        // getFirst() use to first return value

        System.out.println("getFirst() using link => " + link.getFirst());

        // getLast() use to first return value

        System.out.println("getFirst() using link => " + link.getLast());

        // set(index,element value) use to change value index number
        link.set(3, 67);
        System.out.println("set() using link => " + link);
        link1.set(3, 78);
        System.out.println("set() using link => " + link1);

        // remove() use to use as remove element
        System.out.println("remove() using link => " + link.remove(2));
        System.out.println("after remove() using link => " + link);

        System.out.println("remove() using link => " + link1.remove(4));
        System.out.println("after remove() using link => " + link1);

        // removeFirst() use to startig remove
        System.out.println("removeFirst() using link => " + link.removeFirst());
        System.out.println("after removeFirst() using link => " + link);

        System.out.println("removeFirst() using link => " + link1.removeFirst());
        System.out.println("after removeFirst() using link => " + link1);

        // removeLast() use to startig remove
        System.out.println("removeLast() using link => " + link.removeLast());
        System.out.println("after removeLast() using link => " + link);

        System.out.println("removeLast() using link => " + link1.removeLast());
        System.out.println("after removeLast() using link => " + link1);

    }

}

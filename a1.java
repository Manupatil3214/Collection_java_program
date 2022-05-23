
import java.util.ArrayList;

import java.util.Collections;

public class a1 {
    public static void main(String ar[]) {
        ArrayList<String> fruits = new ArrayList<>();

        // using add() method to adding element;

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("plum");
        fruits.add("Greenchilly");
        System.out.println(fruits); // simple print to use
        for (String s : fruits)
            System.out.println(s);

        // we use integer wrapper
        ArrayList<Integer> qty = new ArrayList<>();
        qty.add(10);
        qty.add(12);
        qty.add(100);
        System.out.println(qty); // simple print to use

        for (Integer s1 : qty)
            System.out.println(s1);

        // set element use to change element value

        fruits.set(3, "Apricot");
        System.out.println(fruits);

        qty.set(2, 156);

        System.out.println(qty);
        // remove element are two type
        // ArrayList remove()

        qty.remove(0); // index number give to remove
        System.out.println(qty);
        fruits.remove(2);
        fruits.remove("Mango"); // direct element value give to remove
        System.out.println(fruits);

        // size() => to fine number of element

        System.out.println("fruits size=" + fruits.size());
        System.out.println("qty size=" + qty.size());

        // get()=> index value print then use get method
        System.out.println(qty.get(1));
        System.out.println(fruits.get(2));

        // removeAll()=> all element remove in ArrayList
        fruits.removeAll(fruits);
        qty.removeAll(qty); // we also use clear();

        System.out.println("fruits Use RemoveAll=" + fruits.size());
        System.out.println("qty use removeAll=" + qty.size());
        // clear()=> more easy to use to clear ArrayList
        fruits.clear();
        qty.clear(); // we also use clear();

        System.out.println("fruits Use clear=" + fruits.size());
        System.out.println("qty use clear=" + qty.size());

        // isEmpty()=> To check ArrayList empty or not.
        System.out.println("fruits Use EMPTY=" + fruits.isEmpty());
        System.out.println("qty use EMPTY=" + qty.isEmpty());
        // if we add value in qty the show isEmpty ()

        qty.add(12);

        System.out.println("qty use add=" + qty);
        System.out.println("qty use EMPTY=" + qty.isEmpty());

        // addAll()=> to copy all element of one ArrayList To another Arraylist

        ArrayList<Integer> qty1 = new ArrayList<>();
        qty1.addAll(qty);
        System.out.println("qty use addAll=" + qty1);
        qty1.add(10);
        qty1.add(40);
        qty1.add(20);
        qty1.add(60);
        qty1.add(100);
        System.out.println("qty use add=" + qty1);

        // reverse()=> to reverse ArrayList use reverse() method of collection class;

        Collections.reverse(qty1);
        System.out.println("qty use reverse=" + qty1);

    }
}

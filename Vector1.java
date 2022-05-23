
import java.util.*;

class Vector1 {
    public static void main(String[] arg) {
        // Create a vector
        Vector<String> vec = new Vector<>();

        // Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        System.out.println("Using add() are: " + vec);
        // Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Using addElement() are: " + vec);

        // using set method to change index element
        vec.set(5, "panda");
        System.out.println("Using set() are: " + vec);

        // using remove() to remove index element
        vec.remove(3);
        System.out.println("Using remove() are: " + vec);

        // using size() to calculate element size
        System.out.println("Using size() =" + vec.size());

        // addAll()=> to copy all element of one Vector To another Vector
        Vector<String> vec1 = new Vector<>();

        vec1.addAll(vec);
        System.out.println("Using addAll() =" + vec1);

        // clear() => index clear data
        vec.clear();
        System.out.println("Using clear() =" + vec);

        // isEmpty() => index empty yes or not
        System.out.println("Vec Using isEmpty() =" + vec.isEmpty());
        System.out.println("Vec1 Using isEmpty() =" + vec1.isEmpty());

    }
}

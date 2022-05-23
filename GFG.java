
// Convert Vector to ArrayList in Java
import java.util.Vector;
import java.util.ArrayList;

public class GFG {

    public static void main(String[] args) {

        // Create a Vector that contain strings

        Vector<String> v = new Vector<String>();

        // add values in vector

        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        v.add("e");

        // Display the Vector

        System.out.println(" Vector : " + v);

        // Convert Vector to ArrayList
        ArrayList<String> Arrlist = new ArrayList<String>(v);

        // Display ArrayList
        System.out.println("\n ArrayList : " + Arrlist);
    }
}

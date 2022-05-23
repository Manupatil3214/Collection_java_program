
import java.util.ArrayList;

public class ArrayList_To_Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the list Integer
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println(list);

        list.set(1, 14);
        list.set(0, 18);
        list.set(2, 150);
        System.out.println(list);
        // Add elements to the list String

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Manu");
        list1.add("Payal");
        list1.add("Kajal");
        System.out.println(list1);

        list1.set(1, "MOM");
        list1.set(0, "BROTHER");
        list1.set(2, "GRAND-M0M");
        System.out.println(list1);

        // Convert ArrayList to Array

        // Integer[] array = list.toArray(new Integer[0])
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        System.out.println("Array:");

        // Print the array
        for (Integer n : arr) {
            System.out.println(n);
        }

        // String[] array = list.toArray(new String[0])
        String[] arr1 = new String[list1.size()];
        list1.toArray(arr1);
        System.out.println("Array:");

        for (String n1 : arr1) {
            System.out.println(n1);
        }
        System.out.println("Integer Array Length:" + arr.length);
        System.out.println("String Array Length:" + arr1.length);
    }
}

import java.util.LinkedList;

public class Search_Linkedlist {
    public static void main(String agrs[]) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Manu");
        str.add("kajal");
        str.add("priya");
        str.add("sushma");

        str.add("shraddha");
        str.add("vandana");
        str.add("sushma");
        System.out.println("Linkedlist array =>" + str);

        // indexOf=> use to print frist index value
        System.out.println("indexOf=>Linkedlist array =>" + str.indexOf("sushma"));

        // lastIndexOf=> use to print frist index value
        System.out.println("lastIndexOf=>Linkedlist array =>" + str.lastIndexOf("sushma"));

        // Contains()=> (Boolean) true or false {The specified element}

        if (str.contains("vandana")) {
            System.out.println("Contains use => Vandana is present ");
        } else {
            System.out.println("Contains use => Vandana is not present ");
        }

    }

}

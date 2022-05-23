import java.util.Stack;

public class ArrayList_Stack {

    public static void main(String args[]) {
        // Creat Stack Element name;
        Stack<String> st1 = new Stack<>();
        // push() => use push method to add element to top of the stack;
        st1.push("a");
        st1.push("b");
        st1.push("c");
        st1.push("s");
        st1.push("z");
        System.out.println("Push() use : " + st1);

        // pop() => use to remove element top of the stack;
        st1.pop();
        System.out.println("Pop() use : " + st1);
        String s = st1.pop();
        System.out.println("Pop(){ String s = st1.pop()} use : " + s);

        // peek()=> return object from top of the stack ;
        // st1.peek();
        System.out.println("Peek() use : " + st1.peek());// {c}
        st1.pop();
        System.out.println("Peek() use : " + st1.peek());// {b}

        // search() => return the position from top of the stack;
        st1.push("j");
        st1.push("f");
        st1.push("k");
        st1.push("l");
        st1.push("v");
        System.out.println("Push() use : " + st1);// Push() use : [a, b, j, f, k, l, v]
        System.out.println("Search() use : " + st1.search("k"));// Search() use : 3
        System.out.println("Search() use : " + st1.search("b"));// Search() use : 6

        // empty() => stack is empty or not
        System.out.println("Empty() use : " + st1.empty()); // Empty() use : false

        st1.clear();
        System.out.println("Empty() use : " + st1.empty()); // Empty() use : true

    }

}

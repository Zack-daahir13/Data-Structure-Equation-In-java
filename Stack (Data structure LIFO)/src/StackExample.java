import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Abuur Stack
        Stack<String> stack = new Stack<>();

        // Ku dar elements (push)
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        // Soo bandhig dhammaan element-yada Stack-ka
        System.out.println("Element-yada ku jira Stack-ka: " + stack);

        // Ka saar element-ka ugu dambeeya (pop)
        System.out.println("Element-ka laga saaray Stack-ka waa: " + stack.pop());

        // Soo bandhig Stack-ka kadib pop
        System.out.println("Stack-ka hadda waa: " + stack);

        // Fiiri element-ka ugu sareeya (peek)
        System.out.println("Element-ka ugu sareeya waa: " + stack.peek());
    }
}

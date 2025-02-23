import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Abuur Queue
        Queue<String> queue = new LinkedList<>();

        // Ku dar elements
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Soo bandhig Queue
        System.out.println("Queue-ga hadda waa: " + queue);

        // Ka saar element-ka ugu horeeya (remove)
        System.out.println("Element-ka laga saaray waa: " + queue.remove());

        // Soo bandhig Queue-ga kadib saarista
        System.out.println("Queue-ga hadda waa: " + queue);

        // Fiiri element-ka ugu horeeya ee aan la saarin (peek)
        System.out.println("Element-ka ugu horeeya hadda waa: " + queue.peek());
    }
}

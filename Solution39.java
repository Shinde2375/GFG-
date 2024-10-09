//Reverse First K elements of Queue                 12-01-2024(Friday)


import java.util.Queue;
import java.util.Stack;

    
    class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> queue, int k) {
        if (k <= 0 || k > queue.size()) {
            return queue;
        }

        Stack<Integer> stack = new Stack<>();

        // Push the first K elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Enqueue the elements from the stack back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Enqueue the remaining elements (beyond the first K) back into the queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.poll());
        }
        
        return queue;
    }
}


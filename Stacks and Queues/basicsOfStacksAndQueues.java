import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class basicsOfStacksAndQueues  {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue.remove());
        queue.poll();
    }
}
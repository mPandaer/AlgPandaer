package stackandqueue;

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> input = new LinkedList<>();
    LinkedList<Integer> output = new LinkedList<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if (output.isEmpty()) inputToOutput();
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) inputToOutput();

        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public void inputToOutput(){
        while(!input.isEmpty()) {
            output.push(input.pop());
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}


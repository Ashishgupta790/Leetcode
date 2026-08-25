import java.util.Stack;

class MyQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        moveElements();
        return second.pop();
    }

    public int peek() {
        moveElements();
        return second.peek();
    }

    public boolean empty() {
        return first.empty() && second.empty();
    }

    private void moveElements() {
        if (second.empty()) {
            while (!first.empty()) {
                second.push(first.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
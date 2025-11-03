import java.util.*;

public class isStackOutSquencePossible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++)
            sequence[i] = scanner.nextInt();
        if (_isStackOutSquencePossible(N, sequence))
            System.out.print("YES\n");
        else
            System.out.print("NO\n");
    }

    static boolean _isStackOutSquencePossible(int N, int[] sequence) {
        Stack stack = new Stack(N);
        int current = 1;
        for (int num : sequence) {
            while (current <= N && (stack.isEmpty() || stack.peek() != num)) {
                stack.push(current);
                current++;
            }
            if (stack.isEmpty() || stack.peek() != num) {
                return false;
            }
            stack.pop();
        }
        return true;
    }
}

class Stack {
    private int[] elements;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        top = -1;//栈顶为-1，表示栈为空
    }

    public void push(int element) {
        elements[++top] = element;//将元素压入栈顶，并更新栈顶指针
    }

    public int pop() {
        return elements[top--];//返回栈顶元素并更新栈顶指针
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        return elements[top];
    }
}
class MinStack {
    private int[] stack;
    private int top;
    private int min;

    public MinStack() {
        stack = new int[10000];
        top = -1;
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        top++;
        stack[top] = val;
        min = Math.min(min, val);
    }

    public void pop() {
        if (top == -1) return;
        if (stack[top] == min) {
            min = Integer.MAX_VALUE;
            for (int i = 0; i < top; i++) {
                min = Math.min(min, stack[i]);
            }
        }
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return min;
    }
}
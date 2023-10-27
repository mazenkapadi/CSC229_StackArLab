package org.example;

public class StackArray {

    private int[] stack;
    private int top;
    private int size;


    public StackArray() {
        stack = new int[10];
        top = -1;
        size = 0;
    }

    //void push(int item)
    public void push(int item) {
        if (size == stack.length) {
            resize();
        }
        stack[++top] = item;
        size++;
    }

    //int pop()
    public int pop() {
        if (size == 0) {
            throw new RuntimeException("Stack is empty");
        }
        size--;
        return stack[top--];
    }

    //void show
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    void makeEmpty() {
        top = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == stack.length;
    }

    private void resize() {
        int[] temp = new int[stack.length * 2];
        System.arraycopy(stack, 0, temp, 0, stack.length);
        stack = temp;
    }

    void copy(StackArray source){
        stack = new int[source.stack.length];
        System.arraycopy(source.stack, 0, stack, 0, source.stack.length);
        top = source.top;
        size = source.size;
    }
}

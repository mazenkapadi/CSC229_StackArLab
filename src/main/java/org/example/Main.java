package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.show();
        System.out.println();
        stack.pop();
        stack.show();
        System.out.println();
        stack.pop();
        stack.show();
        System.out.println();
        stack.pop();
        stack.show();
        System.out.println();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.show();
        System.out.println();

        stack.makeEmpty();
        stack.show();
        System.out.println();
    }
}
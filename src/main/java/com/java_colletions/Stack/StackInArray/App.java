package com.java_colletions.Stack.StackInArray;

public class App {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(3);
        System.out.println("Is my stack empty? " + myStack.isEmpty());

        myStack.push("Lucas");
        myStack.push("Oliveira");
        myStack.push("Campos");

        System.out.println("Is my stack empty? " + myStack.isEmpty());

        while (!myStack.isEmpty()){
            myStack.pop(myStack.readTop());
            System.out.println("Is my stack empty? " + myStack.isEmpty());
        }
    }
}

package com.java_colletions.Stack.StackInArray;

import java.util.Arrays;

public class MyStack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public MyStack(int size){
        this.maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public String push(String item){
        return stackArray[++top] = item;
    }


    public String pop (String item){

        if (item.isEmpty()){
            System.out.println("Stack is empty");
            System.exit(-1);
        }

        System.out.println("Removing " + readTop());

        return stackArray[top--];
    }

    public String readTop(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == - 1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public void printStack(){
        System.out.println(Arrays.toString(stackArray));
    }
}

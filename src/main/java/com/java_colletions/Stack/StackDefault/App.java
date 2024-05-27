package com.java_colletions.Stack.StackDefault;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        System.out.println("Is my stack empty: " + stack.empty()); // Retorna 'true' pois ela está vazia

        // Adicionado item na pilha
        stack.push("Lucas");
        stack.push("Oliveira");
        stack.push("Campos");

        System.out.println("Is my stack empty: " + stack.empty()); // Retorna false pois ela não está vazia

        System.out.println("The stack is: " + stack); // Exibindo tudo da pilha
        System.out.println("Do Could you check if Bianca is in the stack?" + stack.search("Biance")); // Retorna '-1', pois o elemento pesquisado não esta na pilha
        System.out.println("Do Could tou check if Lucas is in the stack?" + stack.search("Lucas")); // Retorna '3' que é a posicição do elemento pesquisado

        System.out.println("Removing the first item from the list: " + stack.pop());

        System.out.println("New stack is: " + stack);

        System.out.println("The element at the top of the stack is: " + stack.peek());

    }

}

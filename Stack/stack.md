## Stack 

A Interface Stack faz parte do pacote java.util e representa um pilha, que é uma estrutura de dados que segue o princípio LIFO (Last In, First Out),
ou seja, o último elemento inserido é o primeiro a ser removido

A Stack em Java Collection estende a classe Vector, o que significa que ela é uma pilha baseada em array dinâmico. Isso permite que você adicione elementos à pilha e remova-os de acordo com o princípio LIFO.

### Métodos mais comuns fornecidos pela interface Stack : 

- `push(E item)`: Adiciona um item à pilha. 
- `pop()`: Remove e retorna o elemento no topo da pilha.
- `peek()`: Retorna o elemento ao topo da pilha sem removê-lo.
- `empty()`: Retorna verdadeiro se a pilha estiver *vazia*, falso caso contrário.
- `search(Object o)`: Retorna a posição do objeto na pilha, contando a partir do topo. Se o objeto não estiver na pilha, retorna -1.
<br></br>

### Stack com Array
- `readTop()`: Retorna o valor do elemento que está na posição top.
- `isEmpty()`: Método que verifica se há vazios na pilha.
- `isFull()`: Método que verifica se o array no qual esta armazenado as pilhas não está cheio.
<hr>

### Exemplo Pratico

Stack com Array:

Primeiro crie uma classe com metodos
---
~~~java
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
~~~

Agora, instancie na classe principal : 
---

~~~java
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

~~~

### Stack com programação estrutural: 

~~~java
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

~~~
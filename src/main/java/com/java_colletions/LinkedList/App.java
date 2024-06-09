package com.java_colletions.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<Book>();
        String title = "Titulo do Livro";
        String author = "Autor do Livro";
        Book book = new Book(title, author);
        list.add(book);
        book.message();

        System.out.println("Messagem da LinkedList");
        Iterator<Book> iterator = list.iterator();
        while (iterator.hasNext()) {
            Book book2 = iterator.next();
            book2.message();
        }

        // Adicionando mais elementos à lista
        list.addFirst(new Book("Primeiro Título", "Primeiro Autor")); // Adiciona no início da lista
        list.addLast(new Book("Último Título", "Último Autor")); // Adiciona no final da lista

        System.out.println("Tamanho da lista: " + list.size());

        // Removendo elementos da lista
        Book firstBook = list.removeFirst(); // Remove o primeiro elemento da lista e o armazena
        Book lastBook = list.removeLast(); // Remove o último elemento da lista e o armazena

        System.out.println("Primeiro livro removido: " + firstBook.getTitle()); // Título do primeiro livro removido
        System.out.println("Último livro removido: " + lastBook.getTitle()); // Título do último livro removido

        System.out.println("Nova lista após remoções: " + list); // Imprime a lista após as remoções
    }
}

class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void message(){
        if (this.author.length() == 0 || this.title.length() == 0){
            System.out.println("Erro ao inserir Livro");
        } else {
            System.out.println("Livro inserido com sucesso: " + getTitle() + " - " + getAuthor());
        }
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

package com.java_colletions.Vector;

import java.util.Vector;

public class App {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("Lucas");
        v.add("Oliveira");
        v.add("Campos");
        
        /* Adicionando elementos no vetor */
        v.addElement("Luc");
        v.addElement("Oli");
        v.addElement("Cam"); 
        
        String[] array = new String[6];

        array[0] = "hello";
        array[1] = "world";

        System.out.println("The initial array is: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }

        // Copiando valores do vetor na array
        v.copyInto(array);

        System.out.println("\nThe final array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\nElements in the vector: " + v);
        System.out.println("Length of vector: " + v.size());

        v.set(2, "New Lucas"); // Alterando o index 2 para "New Lucas"
        System.out.println("\nElements after setting index 2 to 'New Lucas': " + v);

        v.remove(2); // Removendo o index 2
        System.out.println("Elements after removing index 2: " + v);

        v.removeAll(v); // Removendo tudo do vetor
        System.out.println("Elements after removing all elements: " + v);
    }
}

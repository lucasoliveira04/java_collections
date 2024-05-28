package com.java_colletions.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Lucas");
        list.add("Lucas");
        list.add("Lucas");
        list.add("Lucas");
        list.add("Lucas");
        list.add("Oliveira");
        list.add("Campos");

        System.out.println("Initial list: " + list);

        if (list.contains("Lucas")) { // Verificando se o valor 'Lucas' está no arrayList
            System.out.println("Lucas already in the list.");
        } else {
            System.out.println("Lucas not found in the list.");
        }
        
        // Iterando de trás para frente para remover "Lucas"
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals("Lucas")) {
                list.remove(i); // Removendo o valor 'Lucas' do arrayList
            }
        }

        System.out.println("\nList after removing 'Lucas': " + list);

        System.out.println("\nIndex of 'Campos': " + list.indexOf("Campos")); // Exibindo index do valor 'Campos' | Retorna -1 caso o valor não esteja no arrayList

        System.out.println("\nIterating over the list:");
        Iterator<String> itr = list.iterator(); // Obtendo todos os valores do ArrayList

        while (itr.hasNext()) {
            System.out.println(itr.next()); // Exibindo todos os valores do ArrayList
        }

        list.clear(); // Removendo todos os valores do ArrayList
        System.out.println("\nList after clearing all elements: " + list);
    }
}

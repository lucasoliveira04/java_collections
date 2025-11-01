package com.java_colletions.List;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <h1>Lista é uma interface onde podemos instânciar ela com as seguintes classes</h1>
 * <ul>
 *     <li>ArrayList</li>
 *     <li>LinkedList</li>
 *     <li>Vector</li>
 * </ul>
 *
 * <p>Lista é comumente utilizada para gerenciar valores e ordenações de forma dinâmica de elementos onde o tamanho de entradas não são fixos.</p>
 *
 * <hr/>
 *
 * <h5>List implementa uma <i>SequencedCollection<E></i> que permite usar a interface Collection e Iterable<E>,
 * assim fica mais fácil realizar a conversão de uma List para as demais classes que não suportam List</h5>
 *
 * */

public class UseList {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        int primeiro = lista.get(0);
        int ultimo = lista.get(lista.size()-1);

        List<Integer> filterPars = lista.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filterPars);

        // lista.removeIf(x -> x % 2 != 0);
        System.out.println(lista);
        lista.set(3, 20);
        System.out.println(lista);

        double getFirstPosition = lista.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .get();

        System.out.println(getFirstPosition);

        double sumEvens = lista.stream()
                .filter(i -> i % 2 != 0)
                        .mapToDouble(i -> i).sum();

        List<String> convertStringList = lista.stream().map(Object::toString).collect(Collectors.toList());

        System.out.println(sumEvens);
        System.out.println(convertStringList.getClass().getName().getClass().getSimpleName());

        System.out.println("Ordem crescente");
        System.out.println(lista.stream().sorted().collect(Collectors.toList()));

        System.out.println("Ordem decrescente");
        System.out.println(lista.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList())
        );
    }
}

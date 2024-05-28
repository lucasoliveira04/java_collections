## ArrayList

<hr/>

A classe Java ArrayList usa um array dinâmico para armazenar os elementos. É como um array, mas não há limites de tamanho. Podemos adicionar ou remover elementos a qualquer momento. Portanto, é muito mais flexível que o array tradicional. Ele é encontrado no pacote `java.util`.

O ArrayList em Java também pode ter elementos duplicados. Ele implementa a interface List para que possamos usar todos os métodos da interface List aqui. O ArrayList mantém o pedido de inserção internamente.

Ele herda a classe AbstractList e implementa a interface List.

## Métodos:

Claro! Aqui estão os métodos listados no formato Markdown:

### Métodos de `ArrayList`

- `add(E e)`: Adiciona o elemento especificado ao final da lista.
- `add(int index, E element)`: Insere o elemento especificado na posição especificada na lista.
- `addAll(Collection<? extends E> c)`: Adiciona todos os elementos da coleção especificada ao final da lista.
- `addAll(int index, Collection<? extends E> c)`: Insere todos os elementos da coleção especificada a partir da posição especificada na lista.
- `clear()`: Remove todos os elementos da lista.
- `clone()`: Retorna uma cópia superficial desta `ArrayList`.
- `contains(Object o)`: Retorna `true` se esta lista contiver o elemento especificado.
- `containsAll(Collection<?> c)`: Retorna `true` se esta lista contiver todos os elementos da coleção especificada.
- `get(int index)`: Retorna o elemento na posição especificada na lista.
- `indexOf(Object o)`: Retorna o índice da primeira ocorrência do elemento especificado na lista, ou -1 se a lista não contiver o elemento.
- `isEmpty()`: Retorna `true` se a lista não contiver elementos.
- `iterator()`: Retorna um iterador sobre os elementos nesta lista na sequência apropriada.
- `lastIndexOf(Object o)`: Retorna o índice da última ocorrência do elemento especificado na lista, ou -1 se a lista não contiver o elemento.
- `listIterator()`: Retorna um iterador de lista sobre os elementos nesta lista (na sequência apropriada).
- `remove(int index)`: Remove o elemento na posição especificada nesta lista.
- `remove(Object o)`: Remove a primeira ocorrência do elemento especificado desta lista, se estiver presente.
- `removeAll(Collection<?> c)`: Remove todos os elementos desta lista que também estão contidos na coleção especificada.
- `removeIf(Predicate<? super E> filter)`: Remove todos os elementos desta lista que satisfazem o predicado fornecido.
- `replaceAll(UnaryOperator<E> operator)`: Substitui cada elemento desta lista pelo resultado de aplicar o operador a esse elemento.
- `retainAll(Collection<?> c)`: Retém apenas os elementos nesta lista que estão contidos na coleção especificada.
- `set(int index, E element)`: Substitui o elemento na posição especificada nesta lista pelo elemento especificado.
- `size()`: Retorna o número de elementos nesta lista.
- `sort(Comparator<? super E> c)`: Classifica esta lista de acordo com a ordem induzida pelo comparador especificado.
- `subList(int fromIndex, int toIndex)`: Retorna uma visão da parte da lista entre os índices especificados, inclusive o `fromIndex` e exclusivo o `toIndex`.
- `toArray()`: Retorna um array contendo todos os elementos desta lista na sequência apropriada.
- `toArray(T[] a)`: Retorna um array contendo todos os elementos desta lista na sequência apropriada; o runtime do array retornado é o do array especificado.
- `trimToSize()`: Ajusta a capacidade da `ArrayList` para o tamanho atual da lista.


<hr/>

## Exemplo prático:

~~~java
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
~~~
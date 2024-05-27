## Vector

Vector é como uma matriz dinâmica que pode aumentar ou diminuir seu tamanho. Ao contrário do array, podemos armazenar *n* números de elementos nele, pois não há limite de tamanho. Faz parte da estrutura Java Collection desde Java 1.2. Ele é encontrado no pacote `java.util` e implementa a interface *List*. Portanto podemos usar todos os métodos da interface *List* aqui.

*Recomenda-se usar a classe Vector somente na implementação thread-safe. Se você não precisar usar a implementação thread-safe, você deve usar o ArrayList, o ArrayList terá um desempenho melhor nesse caso.*

Os Iteradores retornados pela classe. Vector são resistentes a falhas. No caso de modificação simultânea, ele falha e lança *ConcurrentModificationException*

## Métodos

- `add()`: É usado para anexar o elemento especificado no vetor fornecido.
- `addAll()`: É usado para anexar todos os elementos da coleção especificada ao final deste vetor.
- `addElement()`: É usado para anexar o componente especificado ao final deste vetor. Aumenta o tamanho do vetor em um.
- `capacity()`: É usado para obter a capacidade atual deste vetor.
- `clear()`: É usado para deletar todos os elementos deste vetor.
- `clone()`: Retorna um clone deste vetor.
- `contains()`: Retorna `true` se o vetor contiver o elemento especificado.
- `containsAll()`: Retorna `true` se o vetor contiver todos os elementos na coleção especificada.
- `copyInto()`: É usado para copiar os componentes do vetor para o array especificado.
- `elementAt()`: É usado para obter o componente no índice especificado.
- `elements()`: Retorna uma enumeração dos componentes de um vetor.
- `ensureCapacity()`: É usado para aumentar a capacidade do vetor em uso, se necessário. Garante que o vetor possa conter pelo menos o número de componentes especificado pelo argumento de capacidade mínima.
- `equals()`: É usado para comparar o objeto especificado com o vetor para igualdade.
- `firstElement()`: É usado para obter o primeiro componente do vetor.
- `forEach()`: É usado para executar a ação fornecida para cada elemento do `Iterable` até que todos os elementos tenham sido processados ou a ação lance uma exceção.
- `get()`: É usado para obter um elemento na posição especificada no vetor.
- `hashCode()`: É usado para obter o valor do código hash de um vetor.
- `indexOf()`: É usado para obter o índice da primeira ocorrência do elemento especificado no vetor. Retorna -1 se o vetor não contiver o elemento.
- `insertElementAt()`: É usado para inserir o objeto especificado como um componente no vetor fornecido no índice especificado.
- `isEmpty()`: É usado para verificar se este vetor não possui componentes.
- `iterator()`: É usado para obter um iterador sobre os elementos na lista em sequência adequada.
- `lastElement()`: É usado para obter o último componente do vetor.
- `lastIndexOf()`: É usado para obter o índice da última ocorrência do elemento especificado no vetor. Retorna -1 se o vetor não contiver o elemento.
- `listIterator()`: É usado para obter um iterador de lista sobre os elementos na lista em sequência adequada.
- `remove()`: É usado para remover o elemento especificado do vetor. Se o vetor não contiver o elemento, ele permanece inalterado.
- `removeAll()`: É usado para deletar todos os elementos do vetor que estão presentes na coleção especificada.
- `removeAllElements()`: É usado para remover todos os elementos do vetor e definir o tamanho do vetor para zero.
- `removeElement()`: É usado para remover a primeira ocorrência (de menor índice) do argumento do vetor.
- `removeElementAt()`: É usado para deletar o componente no índice especificado.
- `removeIf()`: É usado para remover todos os elementos da coleção que satisfazem o predicado fornecido.
- `removeRange()`: É usado para deletar todos os elementos do vetor cujo índice está entre `fromIndex`, inclusivo, e `toIndex`, exclusivo.
- `replaceAll()`: É usado para substituir cada elemento da lista pelo resultado de aplicar o operador a esse elemento.
- `retainAll()`: É usado para reter apenas o elemento no vetor que está contido na coleção especificada.
- `set()`: É usado para substituir o elemento na posição especificada no vetor pelo elemento especificado.
- `setElementAt()`: É usado para definir o componente no índice especificado do vetor para o objeto especificado.
- `setSize()`: É usado para definir o tamanho do vetor fornecido.
- `size()`: É usado para obter o número de componentes no vetor fornecido.
- `sort()`: É usado para classificar a lista de acordo com a ordem induzida pelo `Comparator` especificado.
- `spliterator()`: É usado para criar um `Spliterator` de ligação tardia e falha rápida sobre os elementos na lista.
- `subList()`: É usado para obter uma visão da parte da lista entre `fromIndex`, inclusivo, e `toIndex`, exclusivo.
- `toArray()`: É usado para obter um array contendo todos os elementos deste vetor na ordem correta.
- `toString()`: É usado para obter uma representação em string do vetor.
- `trimToSize()`: É usado para aparar a capacidade do vetor ao tamanho atual do vetor.

## Exemplo pratico:

~~~java
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

~~~
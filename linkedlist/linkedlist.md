## LinkedList

A classe Java LinkedList usa uma lista duplamente vinculada para armazenar os elementos. Ele fornece uma estruta de dados de lista vinculada. Ele **herda a classe** ``AbstractList`` e implementa as interfaces List e ``Deque``.

Os pontos importantes sobre o Java ``LinkedList`` são:

- A classe pode conter elementos duplicados.
- Mantém o pedido de inserção Não é sincronizada.
- Minipulação é rápida porque nenhuma mudança precisa ocorrer.
- Pode ser usada como lista, pilha ou fila.

## Lista Duplamente Vinculada
No cado de uma lista duplamente vinculada, podemos adicionar ou remover elementos de ambos os lados

## Hierarquia da classe LinkedList
A classe LinkedList estende a classe ``AbstractSequentialList`` e implementa a Interface ``List`` e ``Deque``.


| Método                         | Descrição                                                                                                                                                           |
|--------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **List Interface**             |                                                                                                                                                                     |
| `boolean add(E e)`             | Adiciona o elemento especificado ao final da lista.                                                                                                                 |
| `void add(int index, E element)` | Insere o elemento especificado na posição especificada na lista.                                                                                                   |
| `boolean addAll(Collection<? extends E> c)` | Adiciona todos os elementos na coleção especificada ao final da lista.                                                                                             |
| `boolean addAll(int index, Collection<? extends E> c)` | Adiciona todos os elementos na coleção especificada na posição especificada na lista.                                                                              |
| `void clear()`                 | Remove todos os elementos da lista.                                                                                                                                |
| `boolean contains(Object o)`   | Retorna true se a lista contiver o elemento especificado.                                                                                                           |
| `E get(int index)`              | Retorna o elemento na posição especificada na lista.                                                                                                                |
| `int indexOf(Object o)`        | Retorna a posição da primeira ocorrência do elemento especificado na lista, ou -1 se a lista não contiver o elemento.                                               |
| `int lastIndexOf(Object o)`    | Retorna a posição da última ocorrência do elemento especificado na lista, ou -1 se a lista não contiver o elemento.                                                |
| `E remove(int index)`          | Remove o elemento na posição especificada na lista e retorna o elemento removido.                                                                                   |
| `boolean remove(Object o)`     | Remove a primeira ocorrência do elemento especificado na lista, se estiver presente.                                                                                |
| `E set(int index, E element)`  | Substitui o elemento na posição especificada na lista com o elemento especificado e retorna o elemento originalmente naquela posição.                                |
| `List<E> subList(int fromIndex, int toIndex)` | Retorna uma visão da parte da lista entre os índices fromIndex, inclusive, e toIndex, exclusivo.                                                                    |
| **Deque Interface**            |                                                                                                                                                                     |
| `void addFirst(E e)`           | Insere o elemento especificado no início desta deque.                                                                                                               |
| `void addLast(E e)`            | Insere o elemento especificado no final desta deque.                                                                                                                |
| `Iterator<E> descendingIterator()` | Retorna um iterador sobre os elementos na ordem descendente.                                                                                                        |
| `E getFirst()`                 | Retorna o primeiro elemento na deque.                                                                                                                               |
| `E getLast()`                  | Retorna o último elemento na deque.                                                                                                                                 |
| `boolean offerFirst(E e)`      | Insere o elemento especificado no início desta deque, se possível.                                                                                                  |
| `boolean offerLast(E e)`       | Insere o elemento especificado no final desta deque, se possível.                                                                                                   |
| `E peekFirst()`                | Retorna o primeiro elemento na deque, ou null se a deque estiver vazia.                                                                                             |
| `E peekLast()`                 | Retorna o último elemento na deque, ou null se a deque estiver vazia.                                                                                               |
| `E pollFirst()`                | Retorna e remove o primeiro elemento da deque, ou retorna null se a deque estiver vazia.                                                                            |
| `E pollLast()`                 | Retorna e remove o último elemento da deque, ou retorna null se a deque estiver vazia.                                                                             |
| `E pop()`                      | Remove e retorna o primeiro elemento da deque.                                                                                                                      |
| `void push(E e)`               | Insere o elemento especificado no início desta deque.                                                                                                               |
| `E removeFirst()`              | Remove e retorna o primeiro elemento da deque.                                                                                                                      |
| `boolean removeFirstOccurrence(Object o)` | Remove a primeira ocorrência do elemento especificado na deque, se estiver presente.                                                                               |
| `E removeLast()`               | Remove e retorna o último elemento da deque.                                                                                                                        |
| `boolean removeLastOccurrence(Object o)` | Remove a última ocorrência do elemento especificado na deque, se estiver presente.                                                                                 |

### Exemplo Prático:

~~~java
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

~~~
package ARSWEstadistias;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaEnlazada<T> implements Iterable<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {this.data = data;}
    }

    private Node<T> head;
    private int size = 0;

    public void add(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> current = head;
            while (current.next != null) current = current.next;
            current.next = new Node <>(data);
        }
        size ++;
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;

            public boolean hasNext() { return current != null; }
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}

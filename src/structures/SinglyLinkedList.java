package structures;

public class SinglyLinkedList<T> {
    Node<T> head;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    // CLASSES
    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // METHODS
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        // Check for empty head
        if (this.head == null) {
            this.head = newNode;
        } else {
            // Iterate to final node
            Node<T> last = this.head;
            while (last.next != null) last = last.next;
            last.next = newNode;
        }

        this.length++;
    }

    public T get(int index) {
        if (this.head == null) return null;
        if (index < 0 || index >= this.length) return null;

        // Iterate to desired index
        Node<T> ret = this.head;
        for (int i = 0; i < index; i++) {
            ret = ret.next;
        }

        if (ret == null) return null;
        return ret.data;
    }

    public void remove(int index) {
        if (this.head == null) return;
        if (index < 0 || index >= this.length) return;

        // Iterate to desired index
        Node<T> prev = this.head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public void print() {
        Node<T> cur = this.head;
        System.out.print("[");
        while (cur != null) {
            System.out.print(cur.data + ", ");
            cur = cur.next;
        }
        System.out.print("\b\b]\n");
    }

    // GET SET
    public int length() {
        return this.length;
    }

}

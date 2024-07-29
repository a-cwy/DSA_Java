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

    public void unshift(T data) {
        Node<T> newHead = new Node<>(data);
        newHead.next = this.head;
        this.head = newHead;

        this.length++;
    }

    public void push(T data) {
        Node<T> newTail = new Node<>(data);

        // Iterate to final node
        Node<T> curTail = this.head;
        while (curTail.next != null) curTail = curTail.next;
        curTail.next = newTail;

        this.length++;
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
        this.length--;
    }

    public T shift() {
        Node<T> ret = this.head;
        this.head = this.head.next;

        this.length--;
        return ret.data;
    }

    public T pop() {
        Node<T> cur = this.head;

        // Iterate to second last node
        for (int i = 1; i < this.length - 1; i++) {
            cur = cur.next;
        }

        // Get data of last node and remove last node
        T ret = cur.next.data;
        cur.next = null;

        this.length--;
        return ret;
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

    public void print() {
        Node<T> cur = this.head;
        System.out.print("SinglyLinkedList[");
        while (cur != null) {
            System.out.print(cur.data + ", ");
            cur = cur.next;
        }
        System.out.print("\b\b]\n");
    }

//    public void forEach(/* implement callback with (data, index) */) {
//        // TODO STUB
//    }

//    public T[] toArray() {
//        // TODO STUB
//    }

    // GET SET
    public int length() {
        return this.length;
    }

}

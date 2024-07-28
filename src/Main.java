import structures.*;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();

        sll.add(1);
        sll.add(3);
        System.out.println("> " + sll.length());
        sll.add(5);
        sll.add(7);
        System.out.println("+ " + sll.length());
        sll.add(9);
        System.out.println("+ " + sll.length());

        sll.print();

        System.out.println("> " + sll.get(2));
        System.out.println("+ " + sll.get(0));
        System.out.println("+ " + sll.get(-1));
        System.out.println("+ " + sll.get(5));
        sll.add(11);
        System.out.println("+ " + sll.get(5));

        System.out.println("> " + sll.get(5));
        System.out.println("+ " + sll.get(4));
        System.out.println("+ " + sll.get(3));
        sll.remove(2);
        System.out.println("+ " + sll.get(5));
        System.out.println("+ " + sll.get(4));
        System.out.println("+ " + sll.get(3));
    }
}

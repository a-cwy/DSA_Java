import structures.*;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();

        sll.add("3");
        sll.add("5");
        sll.add("7");
        sll.add("9");
        sll.print();
        System.out.println("Length: " + sll.length());
        sll.unshift("1");
        sll.print();
        System.out.println("Length: " + sll.length());
        sll.push("11");
        sll.print();
        System.out.println("Length: " + sll.length());
        System.out.println();

        String shift = sll.shift();
        System.out.println("Shift: " + shift);
        System.out.println("Length: " + sll.length());
        sll.print();
        System.out.println();

        String pop = sll.pop();
        System.out.println("Pop: " + pop);
        System.out.println("Length: " + sll.length());
        sll.print();
        System.out.println();

    }
}

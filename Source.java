public class Source {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(25);
        list.insert(120);
        list.insert(14);

        System.out.println("\n == Linked List ==");
        list.print();

        list.insertAtStart(00);

        System.out.println("\n == Add 0 at start of Linked List ==");
        list.print();

        list.insertAt(2, 55);

        System.out.println("\n == Add 55 at index 2 of Linked List ==");
        list.print();

        list.insertAt(0, 100);

        System.out.println("\n == Add 100 at index 0 of Linked List ==");
        list.print();

        list.deleteAt(2);

        System.out.println("\n == Remove 25 at index 2 of Linked List ==");
        list.print();

        list.delete(100);

        System.out.println("\n == Remove 100 from Linked List ==");
        list.print();

        list.delete(120);

        System.out.println("\n == Remove 120 from Linked List ==");
        list.print();

        list.delete(14);

        System.out.println("\n == Remove 14 from Linked List ==");
        list.print();

    }
}

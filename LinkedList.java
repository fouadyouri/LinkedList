public class LinkedList {

    Node head;

    public void insert(int value) {

        Node node = new Node();
        node.data = value;
        node.next = null;

        if(head == null) {
            head = node;
        }
        else {
            Node temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;

        }
    }

    public  void insertAtStart(int value) {

        Node node = new Node();

        node.data = value;
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int value) {

        if(index == 0) {
            insertAtStart(value);
        }
        else {
            Node node = new Node();
            node.data = value;

            Node temp = head;

            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;
        }
    }

    public void delete(int value) {
        int index = search(value);
        deleteAt(index);
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        }
        else {
            Node temp = head;

            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }

    }

    public int search(int value) {
        int  index = 0;
        Node temp = head;

        while (temp.data != value) {
            temp = temp.next;
            index++;
        }

        return index;
    }

    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int findMax() {
        Node temp = head;
        int max = temp.data;

        while (temp != null) {
            if (temp.data > max)
                max = temp.data;
            temp = temp.next;
        }
        return max;
    }
}

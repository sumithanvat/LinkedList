public class LinkedList {
    Node head;



    public LinkedList() {
        this.head = null;
    }

    public void insertAfter(int key, int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public int popLast() {
        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        int poppedData = current.data;
        if (prev == null) {
            head = null;
        } else {
            prev.next = null;
        }
        return poppedData;
    }
}

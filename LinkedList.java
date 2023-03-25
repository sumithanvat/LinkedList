public class LinkedList {
    Node head;


    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(Node node, int data) {
        if (node == null) {
            return;
        }

        Node newNode = new Node(data);
        newNode.next = node.next;
        node.next = newNode;
    }
}
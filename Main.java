
public class Main {
    public static void main(String[] args) {
        // Create the linked list
        LinkedList list = new LinkedList();
        list.head = new Node(56);
        list.head.next = new Node(70);

        // Insert the node with data 30 between nodes with data 56 and 70
        list.insertAfter(56, 30);

        // Print the final sequence of the linked list
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
}

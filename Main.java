
public class Main {
    public static void main(String[] args) {
        // Create the linked list
        LinkedList list = new LinkedList();
        list.head = new Node(56);
        list.head.next = new Node(30);
        list.head.next.next = new Node(70);

        // Delete the first element (i.e., the head) of the list
        int poppedData = list.pop();

        // Print the popped data and the final sequence of the linked list
        System.out.println("Popped data: " + poppedData);
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
}
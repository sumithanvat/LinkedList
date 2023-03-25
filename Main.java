
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(56);
        list.insert(30);
        list.insert(40);
        list.insert(70);

        System.out.println("Initial Sequence: ");
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");

        boolean isDeleted = list.delete(40);
        if (isDeleted) {
            System.out.println("Node with value 40 is deleted from the LinkedList");
        } else {
            System.out.println("Node with value 40 is not found in the LinkedList");
        }

        System.out.println("Final Sequence: ");
        current = list.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");

        int size = list.size();
        System.out.println("Size of LinkedList: " + size);
    }
}
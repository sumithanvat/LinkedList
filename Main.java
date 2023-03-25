
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(56);
        list.insert(30);
        list.insert(70);

        Node node = list.search(30);

        if (node != null) {
            list.insertAfter(node, 40);
        }

        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
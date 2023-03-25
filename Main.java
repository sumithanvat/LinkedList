
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(56);
        list.insert(30);
        list.insert(70);

        Node node = list.search(30);

        if (node != null) {
            System.out.println("Found node with data: " + node.data);
        } else {
            System.out.println("Node not found.");
        }
    }
}
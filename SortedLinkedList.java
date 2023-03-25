public class SortedLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private int size;

    public SortedLinkedList() {
        head = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null || data.compareTo(head.getData()) < 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null && data.compareTo(current.getNext().getData()) > 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getData() + " ");
            current = current.getNext();
        }
        return sb.toString();
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}

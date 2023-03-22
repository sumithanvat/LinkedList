public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.printList();
        Node current =list.head;
        while(current !=null){
            System.out.println(current.data+ "->");
            current=current.next;
        }
        System.out.println("nukk");
    }
}
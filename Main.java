
public class Main {
    public static void main(String[] args) {
        SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        System.out.println(list); // prints "30 40 56 70 "
        System.out.println(list.size()); // prints "4"
    }
}
public class ListTester {
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(5);
        sll.add(4);
        sll.add(3);
        sll.add(2);
        sll.add(1);
        sll.printValues();
        sll.remove();
        sll.remove();
        sll.printValues();
    }
}
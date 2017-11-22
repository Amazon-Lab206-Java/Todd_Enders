public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(){
        head = null;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }else{
            Node current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void remove(){
        if (head != null){
            System.out.println("Removing");
            if (head.getNext() == null){
                head = null;
            }else{
                Node current = head;
                while (current.getNext().getNext() != null){
                    current = current.getNext();
                }
                current.setNext(null);
            }
        }
    }

    public void printValues(){
        if (head != null){
            Node current = head;
            while (current != null){
                System.out.println(current.getValue());
                current = current.getNext();
            }
        }
    }
}
public class LinkedList {
    private Node head;
    public void LinkList() {
        head = null;
    }
    public boolean isEmpty() {
     if(head == null) {
         return true;
     } else {
         return false;
     }
    }
    public void insertFirst(int i) {
        Node newNode = new Node(i);
        newNode.next = head;
        head = newNode;
    }
    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }
    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = head;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
    public Node find(int key) {
        Node current = head;
        while(current.data != key) {
            if(current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }
    public void delete(int key) {
        Node current = head;
        Node previous = head;
        while(current.data != key) {
            if(current.next == null) {
                System.out.println("Node not found");
            } else {
                previous = current;
                current = current.next;
            }
        }
        if(current == head) {
            head = head.next;
        } else {
            previous.next = current.next;
        }
    }
    public void insertLast(int i) {
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        Node newNode = new Node(i);
        current.next = newNode;
    }
    public void insertMiddle(int i) {
        Node current = head;
        int count = 0;
        while(current.next != null) {
            current = current.next;
            count++;
        }
        int middle = count / 2;
        current = head;
        for(int j = 0; j < middle; j++) {
            current = current.next;
        }
        Node newNode = new Node(i);
        newNode.next = current.next;
        current.next = newNode;
    }
}

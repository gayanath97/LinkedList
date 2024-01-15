public class Main {
    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        myList.insertFirst(77);
        myList.insertFirst(66);
        myList.insertFirst(55);
        myList.insertFirst(44);
        myList.insertFirst(33);
        myList.insertFirst(22);
        myList.insertFirst(11);
        myList.insertFirst(00);
        myList.displayList();
        myList.delete(99);
        System.out.println("After deleting 99");
        myList.displayList();
        myList.deleteFirst();
        System.out.println("After deleting first");
        myList.displayList();
        System.out.println(myList.find(100).data);
        System.out.println(myList.isEmpty());
        myList.insertLast(9999);
        System.out.println("After inserting 9999");
        myList.displayList();
        myList.insertMiddle(8888);
        System.out.println("After inserting 8888");
        myList.displayList();
    }
}
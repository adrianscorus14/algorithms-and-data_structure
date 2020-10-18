package datastructures.linkedlist;


public class CustomLinkedList {

    Node head;

    Node tail;

    public CustomLinkedList() {
        head = null;
        tail = null;
    }


    public void insertFirst(Node newNode) {
        //In case the list is empty then the last node becomes the newly added node.
        if(tail == null){
            tail = newNode;
        }
        //New node becomes the head of the list.
        newNode.next = head;
        head = newNode;
    }

    /**
     * Inserts a new node at the end of the list.

     */
    public void insertLast(Node newNode){
        //Make sure it does not have a next node linked to it
        newNode.next = null;
        //Last node of the list becomes the newly added node.
        tail.next = newNode;
        tail = newNode;
    }

    /**

     */
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node node = head;
            System.out.print("List: ");
            // Iterate through the entire list.
            while(node != null){
                System.out.print(node.data + ", ");
                node = node.next;
            }
        }
    }
}

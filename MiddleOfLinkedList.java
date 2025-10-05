//middle of linkedList
//two pointer algo

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MiddleOfLinkedList {
    Node head;

    public void findMiddle() {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if (fast == null) {
            // Even length case
            System.out.println("Middle elements are: " + prev.data + " and " + slow.data);
        } else {
            // Odd length case
            System.out.println("Middle element is: " + slow.data);
        }
    }
}
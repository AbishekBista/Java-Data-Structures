public class ReverseLinkedList {

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next=  null;
        }
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode reverse(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ReverseLinkedList rll = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        rll.printList(head);

        ListNode reverse = rll.reverse(head);
        rll.printList(reverse);
    }
}

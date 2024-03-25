public class SinglyLinkedListLength {
    public ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public int printLength() {
        if(head == null) {
            return 0;
        }
        ListNode current = head;
        int length = 0;
        while(current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        SinglyLinkedListLength sll = new SinglyLinkedListLength();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        int length = sll.printLength();
        System.out.println("The length of the linked list: " + length);

    }
}

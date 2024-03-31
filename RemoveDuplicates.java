public class RemoveDuplicates {

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

    public ListNode removeDuplicaListNode(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode current = head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        rd.printList(head);

        ListNode removedDuplicate = rd.removeDuplicaListNode(head);
        rd.printList(removedDuplicate);
    }
}

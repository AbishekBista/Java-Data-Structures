public class FindNFromEnd {

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

    public ListNode findNFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        ListNode mainPtr = head;
        ListNode refPtr = head; // this will first make distance between itself and head
        int count = 0;
        while(count < n) {
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args) {
        FindNFromEnd fnfe = new FindNFromEnd();

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fnfe.printList(head);

        ListNode neededNode = fnfe.findNFromEnd(head, 4);
        System.out.println(neededNode.data);
    }
}

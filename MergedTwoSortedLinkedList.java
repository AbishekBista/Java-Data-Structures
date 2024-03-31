public class MergedTwoSortedLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next=  null;
        }
    }

    public void printList() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtBeginning(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public ListNode mergeLinkedList(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a != null && b != null) {
            if(a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }

        return dummy.next;
    }


    

    public static void main(String[] args) {
        MergedTwoSortedLinkedList a = new MergedTwoSortedLinkedList();

        a.insertAtBeginning(8);
        a.insertAtBeginning(4);
        a.insertAtBeginning(1);
        a.printList();

        MergedTwoSortedLinkedList b= new MergedTwoSortedLinkedList();

        b.insertAtBeginning(6);
        b.insertAtBeginning(3);

        b.printList();

        MergedTwoSortedLinkedList result = new MergedTwoSortedLinkedList();

        result.head = result.mergeLinkedList(a.head, b.head);

        result.printList();
    }
}

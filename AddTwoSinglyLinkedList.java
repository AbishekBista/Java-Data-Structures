public class AddTwoSinglyLinkedList {
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

    public static ListNode addtwoList(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if(a != null) {
                a = a.next;
            }
            if(b != null) {
                b = b.next;
            }
        }
        if(carry > 0) {
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoSinglyLinkedList a = new AddTwoSinglyLinkedList();

        a.insertAtBeginning(8);
        a.insertAtBeginning(4);
        a.insertAtBeginning(1);
        a.printList();

        AddTwoSinglyLinkedList b= new AddTwoSinglyLinkedList();

        b.insertAtBeginning(6);
        b.insertAtBeginning(3);
        b.insertAtBeginning(5);

        b.printList();

        AddTwoSinglyLinkedList c = new AddTwoSinglyLinkedList();
        c.head = addtwoList(a.head, b.head);
        c.printList();
    }
}

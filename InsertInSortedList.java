public class InsertInSortedList {
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

    public void insertAtBeginning( int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public ListNode insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);
        
        ListNode current = head;
        ListNode previous = null;
        
        while(current != null && current.data < newNode.data) {
            previous = current;
            current = current.next;
        }

        previous.next = newNode;
        newNode.next = current;
        
        return head;
    }

    public static void main(String[] args) {
        InsertInSortedList iis = new InsertInSortedList();

        iis.insertAtBeginning(1);
        iis.insertAtBeginning(2);
        iis.insertAtBeginning(3);
        iis.insertAtBeginning(4);
        iis.printList();

        iis.insertInSortedList(8);
        iis.printList();
    }
}

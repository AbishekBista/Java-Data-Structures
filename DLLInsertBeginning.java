public class DLLInsertBeginning {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DLLInsertBeginning() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void displayForward() {
        if(head == null) {
            return;
        }
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if(tail == null) {
            return;
        }
        ListNode current = tail;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.previous;
        }
        System.out.println("null");
    }

    public void insertAtBeginning(int value) {
        ListNode newNode = new ListNode(value);
        if(isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if(isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;

    }

    public static void main(String[] args) {
        DLLInsertBeginning dll = new DLLInsertBeginning();
        dll.insertAtEnd(6);
        dll.insertAtBeginning(4);
        dll.insertAtBeginning(3);
        dll.insertAtBeginning(2);
        dll.insertAtBeginning(1);
        dll.insertAtEnd(5);

        dll.displayForward();
        dll.displayBackward();
    }
}

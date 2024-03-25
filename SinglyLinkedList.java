public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
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

    public void insertBeginning(int value) {
        ListNode insertedNode = new ListNode(value);
        insertedNode.next = head;
        head = insertedNode;
    }

    public void insertEnd(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int value, int position) {
        ListNode newNode = new ListNode(value);
        
        if(position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            int index = 1;
            ListNode previous = head;
            while(index < position - 1) {
                previous = previous.next;
                index++;
            }
    
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
        
    }

    public ListNode deleteFirstNode() {
        if(head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public ListNode deleteLast() {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null) {
            previous = current;
            current = current.next;
        }
        
        previous.next = null;
        return current;
    }

    public void deletePosition(int position) {
        if(position == 1) {
            head = head.next;
        } else {
            int index = 1;
            ListNode previous = head;
            while(index < position - 1) {
                previous = previous.next;
                index++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }

    }

    public boolean findElement(int searchKey) {
        ListNode current = head;
        while(current != null) {
            if(current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverseLinkedList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null; 
        
        while(current != null) {
            next = current.next; // move the next pointer to point to current + 1 position
            current.next = previous; // break the link linking the current node to the next node and point to previous, hence starting the reverse process
            previous = current; // shift previous to the current position
            current = next;
        }
        return previous;
    }

   
    

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        sll.printList(head);

        ListNode reversedListNode = sll.reverseLinkedList(head);
        sll.printList(reversedListNode);

    }
}
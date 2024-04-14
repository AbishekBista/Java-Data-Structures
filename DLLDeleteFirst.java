import java.util.NoSuchElementException;

public class DLLDeleteFirst {
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
    
        public  DLLDeleteFirst() {
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

        public void deleteFirst() {
            if(isEmpty()) {
                throw new NoSuchElementException();
            }
            ListNode temp = head;
            if(head == tail) {
                tail = null;
            } else {
                head.next.previous = null;
            }
            head = head.next;
            temp.next = null;
            length--;
        }

        public void deleteLast() {
            if(isEmpty()) {
                throw new NoSuchElementException();
            }
            
            ListNode temp = tail;
            if(head == tail) {
                head = null;
            } else {
                temp.previous.next = null;
            }
            tail = tail.previous;
            temp.previous = null;
            length--;
        }
    
        public static void main(String[] args) {
            DLLDeleteFirst dll = new DLLDeleteFirst();
            dll.insertAtBeginning(3);
            dll.insertAtBeginning(2);
            dll.displayForward();
            dll.deleteLast();
            dll.displayForward();
        } 
}

public class DetectLoopInList {
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

    public void removeCertainKey(int value) {
        ListNode current = head;
        ListNode previous = null;

        if(current != null && current.data == value) {
            head = current.next;
            return;
        }

        while(current != null && current.data != value) {
            previous = current;
            current = current.next;
        }
        if(current == null)
            return;
        previous.next = current.next;
    }

    public boolean detectLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }

    public void createLoopedList() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        head = one;
        one.next = two;
        two.next = three;
        three.next =four;
        four.next = five;
        five.next = six;
        six.next = null;
    }

    

    public static void main(String[] args) {
        DetectLoopInList rck = new DetectLoopInList();
        rck.createLoopedList();
        System.out.println(rck.detectLoop());
    }
}

public class RemoveCertainKey {
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

    

    public static void main(String[] args) {
        RemoveCertainKey rck = new RemoveCertainKey();

        rck.insertAtBeginning(16);
        rck.insertAtBeginning(11);
        rck.insertAtBeginning(10);
        rck.insertAtBeginning(8);
        rck.insertAtBeginning(1);
        rck.printList();

        rck.removeCertainKey(1);

        
        rck.printList();
    }
}

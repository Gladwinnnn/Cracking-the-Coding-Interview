public class Palindrome {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append('r');
        linkedList1.append('a');
        linkedList1.append('r');
        System.out.println(checkIfPalindrome(linkedList1));

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append('r');
        linkedList2.append('a');
        linkedList2.append('c');
        linkedList2.append('e');
        linkedList2.append('c');
        linkedList2.append('a');
        linkedList2.append('r');
        System.out.println(checkIfPalindrome(linkedList2));

        LinkedList linkedList3 = new LinkedList();
        linkedList3.append('f');
        linkedList3.append('a');
        linkedList3.append('t');
        linkedList3.append('h');
        linkedList3.append('e');
        linkedList3.append('r');
        System.out.println(checkIfPalindrome(linkedList3));
    }

    // O(n) complexity (looping through a LinkedList --> O(n), toString function --> O(n))
    public static boolean checkIfPalindrome(LinkedList linkedList) {
        StringBuilder toString = new StringBuilder();
        Node pointer = linkedList.head;

        while (pointer != null) {
            toString.append(pointer.data);
            pointer = pointer.next;
        }

        String placeHolder = toString.toString();
        String placeHolder2 = toString.reverse().toString();

        return placeHolder.equals(placeHolder2);
    }

    public static class Node {
        Node next;
        char data;

        public Node(char data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head;

        public void append(char data) {
            if (head == null) {
                head = new Node(data);
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }
}
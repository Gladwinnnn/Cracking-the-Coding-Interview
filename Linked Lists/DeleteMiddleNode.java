import java.util.*;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append('a');
        linkedList1.append('b');
        linkedList1.append('c');
        linkedList1.append('d');
        linkedList1.append('e');
        linkedList1.append('f');
        deleteNode(linkedList1, 'c');

        Node print1 = linkedList1.head;
        ArrayList<Character> numberList1 = new ArrayList<>();
        while (print1 != null) {
            numberList1.add(print1.data);
            print1 = print1.next;
        }
        System.out.println(numberList1);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append('a');
        linkedList2.append('b');
        linkedList2.append('c');
        linkedList2.append('d');
        linkedList2.append('e');
        linkedList2.append('f');
        deleteNode(linkedList2, 'b');

        Node print2 = linkedList2.head;
        ArrayList<Character> numberList2 = new ArrayList<>();
        while (print2 != null) {
            numberList2.add(print2.data);
            print2 = print2.next;
        }
        System.out.println(numberList2);

        LinkedList linkedList3 = new LinkedList();
        linkedList3.append('a');
        linkedList3.append('b');
        linkedList3.append('c');
        linkedList3.append('d');
        linkedList3.append('e');
        linkedList3.append('f');
        deleteNode(linkedList3, 'e');

        Node print3 = linkedList3.head;
        ArrayList<Character> numberList3 = new ArrayList<>();
        while (print3 != null) {
            numberList3.add(print3.data);
            print3 = print3.next;
        }
        System.out.println(numberList3);
    }

    // O(n) complexity (iterating through a LinkedList --> O(n))
    public static void deleteNode(LinkedList linkedList, char character) {
        Node current = linkedList.head;

        while (current.next != null) {
            if (current.next.data == character) {
                current.next = current.next.next;
            }
            current = current.next;
        }
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

        public void prepend(char data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }
}
import java.util.*;

public class SumLists {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(7);
        linkedList1.append(1);
        linkedList1.append(6);
        LinkedList reverseLinkedList1 = reverse(linkedList1);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(5);
        linkedList2.append(9);
        linkedList2.append(2);
        LinkedList reverseLinkedList2 = reverse(linkedList2);

        int sum1 = sum(reverseLinkedList1, reverseLinkedList2);
        LinkedList newLinkedList1 = toLinkedList(sum1);
        Node print1 = newLinkedList1.head;
        ArrayList<Integer> numberList1 = new ArrayList<>();
        while (print1 != null) {
            numberList1.add(print1.data);
            print1 = print1.next;
        }
        System.out.println(numberList1);
    }

    // O(n) complexity
    public static LinkedList toLinkedList(int number) {
        LinkedList linkedList = new LinkedList();

        while (number % 10 > 0) {
            linkedList.append(number % 10);
            number /= 10;
        }

        return linkedList;
    }

    // O(n) complexity (looping through a LinkedList)
    public static int sum(LinkedList linkedList1, LinkedList linkedList2) {
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        Node pointer1 = linkedList1.head;
        Node pointer2 = linkedList2.head;

        while (pointer1 != null) {
            temp1.append(pointer1.data);
            pointer1 = pointer1.next;
        }

        while (pointer2 != null) {
            temp2.append(pointer2.data);
            pointer2 = pointer2.next;
        }

        return Integer.parseInt(temp1.toString()) + Integer.parseInt(temp2.toString());
    }

    // O(n) complexity (looping through a LinkedList)
    public static LinkedList reverse(LinkedList linkedList) {
        LinkedList newLinkedList = new LinkedList();
        Node pointer = linkedList.head;

        while(pointer.next != null) {
            newLinkedList.prepend(pointer.data);
            pointer = pointer.next;
        }
        newLinkedList.prepend(pointer.data);
        return newLinkedList;
    }

    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head;

        public void append(int data) {
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

        public void prepend(int data) {
            Node newHead = new Node(data);
            newHead.next = head;
            head = newHead;
        }
    }
}
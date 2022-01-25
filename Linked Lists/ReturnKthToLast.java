// Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list. 

import java.util.*;

public class ReturnKthToLast {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(4);
        linkedList1.append(1);
        linkedList1.append(4);
        linkedList1.append(2);
        linkedList1.append(4);
        LinkedList newLinkedList1 = returnKthToLastElement(linkedList1, 1);

        Node print1 = newLinkedList1.head;
        ArrayList<Integer> numberList1 = new ArrayList<>();
        while (print1 != null) {
            numberList1.add(print1.data);
            print1 = print1.next;
        }
        System.out.println(numberList1);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(4);
        linkedList2.append(1);
        linkedList2.append(4);
        linkedList2.append(2);
        linkedList2.append(4);
        LinkedList newLinkedList2 = returnKthToLastElement(linkedList2, 2);

        Node print2 = newLinkedList2.head;
        ArrayList<Integer> numberList2 = new ArrayList<>();
        while (print2 != null) {
            numberList2.add(print2.data);
            print2 = print2.next;
        }
        System.out.println(numberList2);

        LinkedList linkedList3 = new LinkedList();
        linkedList3.append(4);
        linkedList3.append(1);
        linkedList3.append(4);
        linkedList3.append(2);
        linkedList3.append(4);
        LinkedList newLinkedList3 = returnKthToLastElement(linkedList3, 3);

        Node print3 = newLinkedList3.head;
        ArrayList<Integer> numberList3 = new ArrayList<>();
        while (print3 != null) {
            numberList3.add(print3.data);
            print3 = print3.next;
        }
        System.out.println(numberList3);

        LinkedList linkedList4 = new LinkedList();
        linkedList4.append(4);
        linkedList4.append(1);
        linkedList4.append(4);
        linkedList4.append(2);
        linkedList4.append(4);
        LinkedList newLinkedList4 = returnKthToLastElement(linkedList4, 4);

        Node print4 = newLinkedList4.head;
        ArrayList<Integer> numberList4 = new ArrayList<>();
        while (print4 != null) {
            numberList4.add(print4.data);
            print4 = print4.next;
        }
        System.out.println(numberList4);

        LinkedList linkedList5 = new LinkedList();
        linkedList5.append(4);
        linkedList5.append(1);
        linkedList5.append(4);
        linkedList5.append(2);
        linkedList5.append(4);
        LinkedList newLinkedList5 = returnKthToLastElement(linkedList5, 5);

        Node print5 = newLinkedList5.head;
        ArrayList<Integer> numberList5 = new ArrayList<>();
        while (print5 != null) {
            numberList5.add(print5.data);
            print5 = print5.next;
        }
        System.out.println(numberList5);
    }

    // O(n) complexity (iterating through a LinkedList --> O(n))
    public static LinkedList returnKthToLastElement(LinkedList linkedList, int k) {
        int counter = 1;
        Node current = linkedList.head;
        LinkedList kthToLastElement = new LinkedList();

        if (k == 1) return linkedList;
        while (current.next != null) {
            if (k != counter) {
                current = current.next;
            } else if (k == counter) {
                break;
            }
            counter++;
        }
        kthToLastElement.head = current;
        return kthToLastElement;
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
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }
}
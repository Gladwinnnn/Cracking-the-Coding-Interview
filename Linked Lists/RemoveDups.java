import java.util.*;

public class RemoveDups {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(4);
        linkedList1.append(1);
        linkedList1.append(4);
        linkedList1.append(2);
        linkedList1.append(4);
        removeDuplicates(linkedList1);

        Node print1 = linkedList1.head;
        ArrayList<Integer> numberList1 = new ArrayList<>();
        while (print1.next != null) {
            numberList1.add(print1.data);
            print1 = print1.next;
        }
        System.out.println(numberList1);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.append(4);
        linkedList2.append(1);
        linkedList2.append(3);
        linkedList2.append(2);
        linkedList2.append(5);
        removeDuplicates(linkedList2);

        Node print2 = linkedList2.head;
        ArrayList<Integer> numberList2 = new ArrayList<>();
        while (print2.next != null) {
            numberList2.add(print2.data);
            print2 = print2.next;
        }
        System.out.println(numberList2);

        LinkedList linkedList3 = new LinkedList();
        linkedList3.append(1);
        linkedList3.append(1);
        linkedList3.append(1);
        linkedList3.append(1);
        linkedList3.append(1);
        removeDuplicates(linkedList3);

        Node print3 = linkedList3.head;
        ArrayList<Integer> numberList3 = new ArrayList<>();
        while (print3.next != null) {
            numberList3.add(print3.data);
            print3 = print3.next;
        }
        System.out.println(numberList3);

        LinkedList linkedList4 = new LinkedList();
        linkedList4.append(4);
        linkedList4.append(3);
        linkedList4.append(2);
        linkedList4.append(4);
        linkedList4.append(1);
        removeDuplicates(linkedList4);

        Node print4 = linkedList4.head;
        ArrayList<Integer> numberList4 = new ArrayList<>();
        while (print4.next != null) {
            numberList4.add(print4.data);
            print4 = print4.next;
        }
        System.out.println(numberList4);
    }

    public static void removeDuplicates(LinkedList linkedList) {
        HashSet<Integer> numberList = new HashSet<>();
        Node current = linkedList.head;
        
        while (current.next != null) {
            if (numberList.contains(current.data)) {
                linkedList.delete(current.data);
            }
            numberList.add(current.data);
            current = current.next;
        }
        if (!numberList.contains(current.data)) {
            linkedList.append(current.data);
        }
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

        public void delete(int data) {
            if (head == null) return;

            if (head.data == data) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }
    }
}
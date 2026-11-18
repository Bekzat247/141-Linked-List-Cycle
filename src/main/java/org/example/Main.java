
package org.example;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode first = head;
        ListNode last = head;

        while (last != null && last.next != null) {
            first = first.next;
            last = last.next.next;

            if (first == last) {
                return true;
            }
        }

        return false;
    }
}

class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println("Test 1: " + solution.hasCycle(node1));
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(3);

        node5.next = node6;
        node6.next = node7;

        System.out.println("Test 2: " + solution.hasCycle(node5));
        ListNode node8 = new ListNode(1);
        node8.next = node8;

        System.out.println("Test 3: " + solution.hasCycle(node8));

        System.out.println("Test 4: " + solution.hasCycle(null));
    }
}

public class MiddleNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Solution solution = new Solution();

        ListNode newHead = solution.middleNode(node1);

        ListNode current = newHead;
        while (current != null) {
            System.out.print(" " + current.val);
            current = current.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/**
 * Calculate the middle node of a singly linked list.
 * 
 * @param The head of a singly linked list.
 * @return The middle node of the linked list.
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } 
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode middleNode = new ListNode(slow.val);

        ListNode resultHead = middleNode;
        ListNode current = slow.next;

        while (current != null) {
            ListNode newNode = new ListNode(current.val);
            resultHead.next = newNode;
            resultHead = resultHead.next;
            current = current.next;
        }
        
        return middleNode;
    }
}

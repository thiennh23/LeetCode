package Problem160;

public class Solution {
    public static void main(String[] args) {
        /*ListNode intersect1 = new ListNode(8);
        ListNode intersect2 = new ListNode(4);
        ListNode intersect3 = new ListNode(5);
        intersect1.next = intersect2;
        intersect2.next = intersect3;

        ListNode headA = new ListNode(4);
        ListNode headA1 = new ListNode(1);
        headA.next = headA1;
        headA1.next = intersect1;

        ListNode headB = new ListNode(5);
        ListNode headB1 = new ListNode(6);
        ListNode headB2 = new ListNode(1);
        headB.next = headB1;
        headB1.next = headB2;
        headB2.next = intersect1;*/

        /*ListNode headA = new ListNode(1);
        ListNode headA1 = new ListNode(3);
        ListNode headA2 = new ListNode(5);
        ListNode headA3 = new ListNode(7);
        ListNode headA4 = new ListNode(8);
        ListNode headA5 = new ListNode(11);
        ListNode headA6 = new ListNode(13);
        ListNode headA7 = new ListNode(15);
        ListNode headA8 = new ListNode(17);
        ListNode headA9 = new ListNode(19);
        ListNode headA10 = new ListNode(21);
        headA.next = headA1;
        headA1.next = headA2;
        headA2.next = headA3;
        headA3.next = headA4;
        headA4.next = headA5;
        headA5.next = headA6;
        headA6.next = headA7;
        headA7.next = headA8;
        headA8.next = headA9;
        headA9.next = headA10;

        ListNode headB = new ListNode(1);*/

        /*ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);
        headA.next = headB;*/

        ListNode headA = new ListNode(1);

        ListNode headB = new ListNode(2);
        ListNode headB1 = new ListNode(3);
        ListNode headB2 = new ListNode(4);
        ListNode headB3 = new ListNode(5);
        ListNode headB4 = new ListNode(6);
        ListNode headB5 = new ListNode(7);
        ListNode headB6 = new ListNode(8);
        ListNode headB7 = new ListNode(9);
        ListNode headB8 = new ListNode(10);
        ListNode headB9 = new ListNode(11);
        ListNode headB10 = new ListNode(12);

        headA.next = headB;
        headB.next = headB1;
        headB1.next = headB2;
        headB2.next = headB3;
        headB3.next = headB4;
        headB4.next = headB5;
        headB5.next = headB6;
        headB6.next = headB7;
        headB7.next = headB8;
        headB8.next = headB9;
        headB9.next = headB10;



        System.out.println("Intersected at " + getIntersectionNode(headA, headB).val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headB;
        while (headA != null) {
            if (headA == temp)
                return headA;
            else {
                if (temp == null) {
                    headA = headA.next;
                    temp = headB;
                } else {
                    temp = temp.next;
                }
            }
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

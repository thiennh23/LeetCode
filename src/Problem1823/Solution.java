package Problem1823;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findTheWinner(3, 1));
        System.out.println(findTheWinner(5, 2));
        System.out.println(findTheWinner(6, 5));
    }

    public static int findTheWinner(int n, int k) {
        ListNode head = new ListNode(1, null);
        ListNode current = head;
        for (int i = 2; i <= n; i++) {
            ListNode temp = new ListNode(i, null);
            current.next = temp;
            current = current.next;
        }
        current.next = head;
        int result = leave(head, k);
        return result;
    }

    /*public static void show(ListNode head) {
        if (head != null) {
            System.out.print(head.data);
            show(head.next);
        }
    }*/

    public static int leave(ListNode head, int k) {

        if (head.next == head) {
            return head.data;
        }


        if (k == 1){
            ListNode temp = head;
            while (head.next != temp)
                head = head.next;
            return head.data;
        }

        //ListNode current = head;
        int count = 1; //count clockwise, also count the start person
        while (count != k - 1) {
            count++;
            head = head.next;
        }
        head.next = head.next.next;
        head = head.next;
        return leave(head, k);
    }

    public static class ListNode {
        int data;
        ListNode next;
        ListNode(){};
        ListNode(int data) {this.data = data;}
        ListNode(int data, ListNode next) {this.data = data; this.next = next;}
    }


}

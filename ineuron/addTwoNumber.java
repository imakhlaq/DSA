class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class AddNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int carry = 0;

        while (ptr1 != null || ptr2 != null) {
            int sum = carry;

            if (ptr1 != null) {
                sum += ptr1.val;
                ptr1 = ptr1.next;
            }

            if (ptr2 != null) {
                sum += ptr2.val;
                ptr2 = ptr2.next;
            }

            current.next = new ListNode(sum % 10);
            current = current.next;
            carry = sum / 10;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }


    public static void main(String[] args) {

        mySqrt(4);

    }
}

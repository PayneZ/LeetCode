/**
 * Created by Payne on 2017/9/10.
 */
public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int counter = 0;
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode tail = new ListNode(0);
        while(l1 != null && l2 != null)
        {
            int sum = l1.val + l2.val + carry;
            ListNode node;
            if(sum >= 10) {
                carry = 1;
                node = new ListNode(sum - 10);
            }
            else {
                carry = 0;
                node = new ListNode(sum);
            }

            if(counter == 0)
            {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            l1 = l1.next;
            l2 = l2.next;
            counter++;
        }

        if(l1 != null)
        {
            if(carry == 0)
                tail.next = l1;
            else
                tail.next = addTwoNumbers(l1, new ListNode(carry));
        }
        else if(l2 != null)
        {
            if(carry == 0)
                tail.next = l2;
            else
                tail.next = addTwoNumbers(l2, new ListNode(carry));
        }
        else if(carry != 0)
            tail.next = new ListNode(carry);

        return head;

    }
}

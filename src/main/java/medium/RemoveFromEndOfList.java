package medium;

import implement.ListNode;

public class RemoveFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n){
        int len = 0;

        ListNode tmp = head;

        while(tmp != null){
            len++;
            tmp = tmp.next;
        }
        tmp = head;
        while(len - n > 1){
            tmp = tmp.next;
            len--;
        }
        if(tmp.next != null){
            if(tmp.next.next != null){
                tmp.next = tmp.next.next;
            } else{
                tmp.next = null;
            }

        } else{
            head =null;
        }

        return head;
    }
}

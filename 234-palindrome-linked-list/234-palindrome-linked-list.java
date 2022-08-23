/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public static boolean isPalindrome(ListNode head) {
          if(head == null || head.next == null) return true;
          ListNode middle = findMiddle(head);
          ListNode nextMiddle = reverse(middle.next);
          middle.next = null;
          while(head != null && nextMiddle != null){
              if(head.val != nextMiddle.val){
                  return false;
              }
              head = head.next;
              nextMiddle = nextMiddle.next;
          }
          
          return true;
    }
    
    public static ListNode findMiddle(ListNode head){
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public static ListNode reverse(ListNode head){
        ListNode prev = null, curr = head, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
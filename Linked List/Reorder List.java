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
    public void reorderList(ListNode head) {
      if(head==null)
      {
        head=new ListNode(0);
      }
      ListNode start=head;
      ListNode slow=head;
      ListNode fast=head;
      ListNode head1=head;
      //ListNode ret=head;
      ListNode next1=null;
      ListNode next2=null;
      
      while(fast!=null && fast.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
      }
      
      ListNode head2=reverse(slow);
      
      
      while(head1!=null && head2!=null)
      {
        next1=head1.next;
        next2=head2.next;
        
        head1.next=head2;
        head2.next=next1;
        if(head1.next==null)
        {
          head1=null;  
        }
        else
        {
          head1=head1.next.next;
        }
        
        head2=next2;
      }
      if(head1!=null)
      {
        head1.next=null;  
      }
      head=start;
      
      //return(ret);
    }
  
  public ListNode reverse(ListNode head)
  {
    ListNode prev=null;
    ListNode curr=head;
    ListNode next=null;
    
    while(curr!=null)
    {
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
      //prev=prev.next;
    }
    return(prev);
  }
}

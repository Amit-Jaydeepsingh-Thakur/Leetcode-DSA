Link-https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3486/

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
    public ListNode rotateRight(ListNode head, int k) 
    {
      int size=0,len=0;
      
      if(head==null)
      {
        return(head);
      }
      
      if(k==0)
      {
        return(head);
      }
      
      ListNode node=new ListNode(0);
      ListNode newHead=node;
      ListNode head1=head;
      ListNode head2=head;
      ListNode head3=head;
      ListNode ret=node;
      
      while(head1!=null)
      {
        size++;
        head1=head1.next;
      }
      
      k=k%size;
      
      while(len!=(size-(k)))
      {
        len++;
        head2=head2.next;
      }
      
      head1=head2;
      //System.out.println(head2.val);
      
      while(head2!=null)
      {
        ListNode newNode=new ListNode(head2.val);
        node.next=newNode;
        node=node.next;
        head2=head2.next;
      }
      
      //System.out.println(head2.val);
      
      while(head3!=head1)
      {
        ListNode newNode=new ListNode(head3.val);
        node.next=newNode;
        node=node.next;
        head3=head3.next;
      }
      
     // System.out.println(head3.val);
      
      node.next=null;
      
      return(ret.next);

            
    }
}

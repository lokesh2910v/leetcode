/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode node=head;
        ArrayList<ListNode> l=new ArrayList<>();
        while(node!=null){
            if(l.contains(node)){
                return true;
            }
            l.add(node);
            node=node.next;
        }
        return false;
    }
}
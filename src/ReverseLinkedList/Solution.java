package ReverseLinkedList;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	 }

public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode preHead = null;
		while(head != null){
			ListNode tmpHead = head.next;
			head.next = preHead;
			preHead = head;
			head = tmpHead ;
		}
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

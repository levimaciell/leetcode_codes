public class RemoveDuplicatesSortedList{
    public static void main(String[] args) {
        
        
        ListNode n4 = new ListNode(3, null);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode root = new ListNode(1, n1);

        //ListNode n5 = new ListNode(0, null);

        ListNode ret = deleteDuplicates(root);

        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode actual= head;
        ListNode previous = head;
        actual = actual.next;

        while (actual != null) {

            //Valor atual igual ao anterior
            //Mudar o apontador next do anterior para o apontador next do atual 
            if(actual.val == previous.val){
                previous.next = actual.next;
            }
            else{
                previous = actual;
            }

            actual = actual.next;
        }

        return head;
    }
}
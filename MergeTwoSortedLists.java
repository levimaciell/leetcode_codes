public class MergeTwoSortedLists {
    
    public static void main(String[] args) {

        // ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));


        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode();

        ListNode node = mergeTwoLists(l1, l2);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println(node.val);

            if(node.next == null)
                continuar = false;

            node = node.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Possível otimização com stack, para evitar O(n²)
        ListNode sNode = null;

        while (list1 != null || list2 != null) {
            
            
            if(list2 != null){
                if(list1 != null && list1.val <= list2.val){
                    if(sNode == null){
                        sNode = new ListNode(list1.val);
                    }
                    else if(sNode.next == null){
                        sNode.next = new ListNode(list1.val);
                    }
                    else{
                        ListNode lastNode = sNode.next;

                        while (lastNode.next != null) {
                            lastNode = lastNode.next;
                        }
                        lastNode.next = new ListNode(list1.val);
                    }
                    
                    //System.out.println("Adding list1 = " + list1.val);

                    list1 = list1.next;
                }
            }
            else if(list1 != null){
                if(sNode == null){
                    sNode = new ListNode(list1.val);
                }
                else if(sNode.next == null){
                    sNode.next = new ListNode(list1.val);
                }
                else{
                    ListNode lastNode = sNode.next;

                    while (lastNode.next != null) {
                        lastNode = lastNode.next;
                    }
                    lastNode.next = new ListNode(list1.val);
                }
                //System.out.println("Adding list1 because list2 is null = " + list1.val);
                list1 = list1.next;
            }

            if(list1 != null){
                if(list2 != null && list2.val < list1.val){
                    if(sNode == null){
                        sNode = new ListNode(list2.val);
                    }
                    else if(sNode.next == null){
                        sNode.next = new ListNode(list2.val);
                    }
                    else{
                        ListNode lastNode = sNode.next;

                        while (lastNode.next != null) {
                            lastNode = lastNode.next;
                        }
                        lastNode.next = new ListNode(list2.val);
                    }
                    
                    //System.out.println("Adding list2 = " + list2.val);
                    list2 = list2.next;
                }
            }
            else if(list2 != null){
                if(sNode == null){
                    sNode = new ListNode(list2.val);
                }
                else if(sNode.next == null){
                    sNode.next = new ListNode(list2.val);
                }
                else{
                    ListNode lastNode = sNode.next;

                    while (lastNode.next != null) {
                        lastNode = lastNode.next;
                    }
                    lastNode.next = new ListNode(list2.val);
                }

                //System.out.println("Adding list2 because list1 is null = " + list2.val);
                list2 = list2.next;
            }
        }

        return sNode;
    }

}

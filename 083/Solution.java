class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        Set<Integer> set = new HashSet<>();

        //pre表示新链表最后一个结点
        ListNode pre = head;
        //curNode表示当前要处理的结点，从第二个元素开始搜索
        ListNode curNode = pre.next;
        set.add(pre.val); //第一个元素直接放到Set

        while (curNode != null) {
            //如果当前元素已经在Set中存在了，说明遇到了重复元素
            if (set.contains(curNode.val)) {
                //向后搜索，直到遇到一个元素不在Set中或者走完整个链表
                while (curNode != null && set.contains(curNode.val)) {
                    curNode = curNode.next;
                }
                //如果curNode指向Null说明后面的元素都重复了，直接break
                if (curNode == null) {
                    break;
                }
            }
            //如果上面没有break，说明找到了一个没有出现过的元素
            set.add(curNode.val);
            pre.next = curNode;
            pre = curNode;
            curNode = curNode.next;
        }
        //整个链表最后要指向null
        pre.next = null;
        return head;
    }
}
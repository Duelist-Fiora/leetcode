class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return result;
        }
        Stack<Command> stack = new Stack<>();

        stack.push(new Command(true,root));

        while (!stack.empty()) {

            Command command = stack.pop();
            if (command.command == false) {
                result.add(command.node.val);
            } else {
                if (command.node.right != null) {
                    stack.push(new Command(true,command.node.right));
                }
                stack.push(new Command(false,command.node));
                if (command.node.left!= null) {
                    stack.push(new Command(true,command.node.left));
                }
            }
        }


        return result;
    }
}
class Command{
    Boolean command;
    //true表示准备访问某结点
    //false表示访问当前结点
    TreeNode node;
    Command(Boolean command, TreeNode node) {
        this.command = command;
        this.node = node;
    }
}
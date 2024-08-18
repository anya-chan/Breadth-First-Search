import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static TreeNode search(TreeNode root, int value){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curNode = queue.poll();
            System.out.println(curNode.getValue());
            if(curNode.getValue() == value){
                return curNode;
            }
            queue.addAll(curNode.getChildrens());
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What value you want to search in Tree?");
        int searchingValue = sc.nextInt();
        sc.close();

        TreeNode root = new TreeNode(10);
        TreeNode child = root.setChildrens(5);
        root.setChildrens(7);
        root.setChildrens(15);
        TreeNode childchild = child.setChildrens(115);
        childchild.setChildrens(207);
        TreeNode resultNode = search(root, searchingValue);
        System.out.println("You are finding: " + searchingValue);
        if(resultNode != null){
            System.out.println("Search from Tree: " + resultNode.getValue());
        }
        else {
            System.out.println("Result not found");
        }
    }
}
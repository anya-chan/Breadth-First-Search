import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    private int val;
    List<TreeNode> childrens;

    public TreeNode(int val){
        this.val = val;
        this.childrens = new LinkedList<TreeNode>();
    }

    public int getValue(){
        return this.val;
    }

    public List<TreeNode> getChildrens() {
        return this.childrens;
    }

    public TreeNode setChildrens(int val) {
        TreeNode newChild = new TreeNode(val);
        this.childrens.add(newChild);
        return newChild;
    }
}

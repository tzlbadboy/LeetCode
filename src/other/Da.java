package other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Da{
	 public List<TreeNode> generateTrees(int n) {
	        if(n == 0) return null;
	        ArrayList<TreeNode>[] result = new ArrayList[n + 1];
	        result[0] = new ArrayList<TreeNode>();
	        result[0].add(null);
	        for(int i = 1; i < n + 1; i++){
	            result[i] = new ArrayList<TreeNode>();
	            for(int j = 1; j < i + 1; j++){
	                
	                
	                for(TreeNode leftTree:result[j - 1]){
	                	
	                    for(TreeNode rightTree:result[i - j]){
	                    	TreeNode node = new TreeNode(j);
	                        node.left = leftTree;
	                        node.right = this.clone(rightTree,j);
	                        result[i].add(node);
	                    }
	                }
	                
	            }
	        }
	        return result[n];
	    }
	    
	    public TreeNode clone(TreeNode tree,int j){
	        if (tree == null) return null;
	        TreeNode root = new TreeNode(tree.val + j);
	        if(tree.left != null){
	           root.left = clone(tree.left,j);
	        }
	        if(tree.right != null){
	           root.right = clone(tree.right,j);
	        }
	        return root;
	    }

	public static void main(String[] args) {
		CopyOnWriteArrayList x = new CopyOnWriteArrayList();
		x.add("1");
		x.add("2");
		Iterator it = x.iterator();
		int i = 0;
		while(it.hasNext()&&i<3){
			x.add("3");
			i++;
		}
		
		
		
	}

}

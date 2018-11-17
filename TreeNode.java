public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
	val = x;
	}// end constructor

 public String toString() {
	return "val is " + val;

} // end method toString


public static void main(String[] args) {
	TreeNode t1 = new TreeNode(1);
	t1.left = new TreeNode(2);
	t1.right = new TreeNode(1);

	TreeNode t2 = new TreeNode(1);
	t2.left = new TreeNode(24);
	t2.right = new TreeNode(1);

	
	Solution s = new Solution();
	if (s.isSameTree(t1, t2))
		System.out.println("Same tree");

} // end method main


}// end class TreeNode


class Solution {



	public boolean isSameTree(TreeNode p, TreeNode q) {
	
	TreeNode temp1;
	TreeNode temp2;

	if (p.val != q.val) {
	System.out.print("NOT same ");
	return false;

	} else {
	
	temp1 = p.left;
	temp2 = q.left;
	
	while (temp1 != null || temp2 != null ) {


	if (temp1 == null) {
	System.out.print("NOT same ");
	return false;

	} else if (temp2 == null) {
	System.out.print("NOT same ");
	return false;

	} else if (temp1.val != temp2.val) {
	System.out.print("NOT same ");
	return false;

	} else {

	}

	temp1 = temp1.left;
	temp2 = temp2.left;
	
	}// end while loop


	
	temp1 = p.right;
	temp2 = q.right;
	while (temp1 != null || temp2 != null ) {


	if (temp1 == null) {
	System.out.print("NOT same ");
	return false;

	} else if (temp2 == null) {
	System.out.print("NOT same ");
	return false;

	} else if (temp1.val != temp2.val) {
	System.out.print("NOT same ");
	return false;

	} else {

	}
	temp1 = temp1.right;
	temp2 = temp2.right;


} // end while loop

}  // end else


	// System.out.print("same ");
	return true;

	


} // end method isSameTree

} // end class Solution
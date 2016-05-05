package main.zInterview.code;

public class TrinaryTree {
	
	private int value;
	private TrinaryTree left;
	private TrinaryTree right;
	private TrinaryTree middle;
	private TrinaryTree parent ;
	
	public TrinaryTree getParent() {
		return parent;
	}

	public void setParent(TrinaryTree parent) {
		this.parent = parent;
	}

	public TrinaryTree(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public TrinaryTree getLeft() {
		return left;
	}
	public void setLeft(TrinaryTree left) {
		this.left = left;
	}
	public TrinaryTree getRight() {
		return right;
	}
	public void setRight(TrinaryTree right) {
		this.right = right;
	}
	public TrinaryTree getMiddle() {
		return middle;
	}
	public void setMiddle(TrinaryTree middle) {
		this.middle = middle;
	}
	
	
}

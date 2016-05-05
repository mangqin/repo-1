package main.zInterview.code;

import java.security.InvalidParameterException;

public class TrinaryTreeHelper {
	
	public static void insert(TrinaryTree node,int value) {
		if (node==null) {
			throw new InvalidParameterException();
		}
		if (value < node.getValue()) {
			//Left child exist
			if (node.getLeft() != null) {
				insert(node.getLeft(), value);
			} else{
				node.setLeft( new TrinaryTree(value));
			}
		}
		else if (value > node.getValue()){
			if (node.getRight() != null) {
				insert(node.getRight(), value);
			} else{
				node.setRight(new TrinaryTree(value));
			}
			
		}else {
			if (node.getMiddle() != null){
				insert(node.getMiddle(), value);
			}else{
				node.setMiddle(new TrinaryTree(value));
			}
		}
	}
	
	public static TrinaryTree delete (TrinaryTree node,int val) {
		if (node==null) {
			return node;
		}
		
	    if (val < node.getValue()) {
	    	node.setLeft ( delete(node.getLeft(), val));
	      } else if (val > node.getValue()) {
	        node.setRight ( delete(node.getRight(), val));
	      } else {
	    	  if (node.getMiddle ()!= null) {
	    		  //delete middle as it will always be childless or single single child only
	    		  node.setMiddle(null);  
	    	  }
	    	  if (node.getRight()!=null) {
	        	TrinaryTree min = getMin(node.getRight());
	        	min.setLeft(node.getLeft());
	        	node = node.getRight();
	        } else {
	        	node= node.getLeft();
	        }
	      }
	      return node;
		
	}
	
	public static TrinaryTree getMin (TrinaryTree node) {
		if(node != null)
	      {
	          while (node.getLeft() != null)
	          {
	              return getMin(node.getLeft());
	          }
	      }

	      return node;
	}
	
	
	public static void print(TrinaryTree node) {
		if (node!=null) {
			System.out.println("Node value : " + node.getValue());
			print(node.getLeft());
			print(node.getMiddle());
			print(node.getRight());
		}
	}
	
	public static boolean findVal (TrinaryTree node, int val) {
		if (node!=null) {
			if (val == node.getValue()) {
				return true;
			} else if (val>node.getValue()) {
				return findVal (node.getRight(),val);
			} else {
				return findVal(node.getLeft(),val);
			}
		}
		
		return false;
	}
	


}

package test.zinterview.code;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.zInterview.code.TrinaryTree;
import main.zInterview.code.TrinaryTreeHelper;


public class TrinaryTreeTest {
	
	 
	@Test 
	public void insertTest (){
		int[] vals = {5, 4, 9, 5, 7, 2, 2};
		TrinaryTree t= new TrinaryTree(vals[0]);
		for (int i = 1; i < vals.length; i++) {
	          TrinaryTreeHelper.insert(t, vals[i]);
		}
		TrinaryTreeHelper.print(t);
		assertTrue(TrinaryTreeHelper.findVal(t,9));
	}
	
	@Test
	public void deleteTest() {
		int[] vals = {5,3, 4, 9, 5, 7, 2, 2,5,5,5};
		TrinaryTree t= new TrinaryTree(vals[0]);
		
		for (int i = 1; i < vals.length; i++) {
	          TrinaryTreeHelper.insert(t, vals[i]);
		}
		System.out.println("Before Delete");
		TrinaryTreeHelper.print(t);
		t = TrinaryTreeHelper.delete(t, 5);
		System.out.println("After Delete ");
		TrinaryTreeHelper.print(t);
		assertTrue(!TrinaryTreeHelper.findVal(t, 5));
		
		
	}

}

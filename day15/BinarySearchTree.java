package com.day15;

public class BinarySearchTree {
	private Object root;

	public static void main(String[] args) {  

	      BinarySearchTree bt = new BinarySearchTree();  
	    
	      bt.insert(56);  
	      bt.insert(30);  
	      bt.insert(70);  
	      bt.insert(60);  
	      bt.insert(10);  
	      bt.insert(90);  

	      System.out.println("Binary search tree after insertion:");  
	      //Displays the binary tree  
	      bt.inorderTraversal(bt.root);  

	      Node deletedNode = null;  
	     
	      deletedNode = bt.deleteNode(bt.root, 90);  
	      System.out.println("\nBinary search tree after deleting node 90:");  
	      bt.inorderTraversal(bt.root);  

	     
	      deletedNode = bt.deleteNode(bt.root, 30);  
	      System.out.println("\nBinary search tree after deleting node 30:");  
	      bt.inorderTraversal(bt.root);  

	     
	      deletedNode = bt.deleteNode(bt.root, 56);  
	      System.out.println("\nBinary search tree after deleting node 56:");  
	      bt.inorderTraversal(bt.root);  
	  }

	private Node deleteNode(Object root2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private void inorderTraversal(Object root2) {
		// TODO Auto-generated method stub
		
	}

	private void insert(int i) {
		// TODO Auto-generated method stub
		
	}  

}

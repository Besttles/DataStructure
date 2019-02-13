package com.tree;

public class Main {

	public static void main(String[] args) {
		
		//create a tree
		BinaryTree tree = new BinaryTree();
		//create a root node
		TreeNode root = new TreeNode(0);
		//set a root node
		tree.setRoot(root);
		//create some node
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		root.setlNode(node1);
		root.setrNode(node2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node1.setlNode(node3);
		node1.setrNode(node4);
		
		//before itrator a tree  前序遍历
		System.out.println("========前序遍历=========");
		tree.frontShow();
		System.out.println("========中序遍历=========");
		tree.middleShow();
		System.out.println("========后序遍历=========");
		tree.afterShow();
		System.out.println("========前序查找=========");
		TreeNode fondSearch = tree.fondSearch(3);
		System.out.printf("the result is %s \n",fondSearch.getValue());
		System.out.println("========中序查找=========");
		TreeNode midSearch = tree.midSearch(3);
		System.out.printf("the result is %s \n",midSearch.getValue());
		System.out.println("========后序查找=========");
		TreeNode afterSearch = tree.afterSearch(1);
		System.out.printf("the result is %s \n",afterSearch.getValue());
	}
}

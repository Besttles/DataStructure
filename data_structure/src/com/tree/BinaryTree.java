package com.tree;

public class BinaryTree {

	//setting a root node
	TreeNode root;

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	public TreeNode getRoot() {
		return root;
	}
	public void frontShow() {
		root.frontShow();
	}

	public void  middleShow() {
		root.middleShow();
	}
	public void afterShow() {
		root.afterShow();
	}

	public TreeNode fondSearch(int i) {
        TreeNode fondSearch = root.fondSearch(i);
		return fondSearch;
	}
	public TreeNode midSearch(int i) {
		TreeNode midSearch = root.midSearch(i);
		return midSearch;
	}
	public TreeNode afterSearch(int i) {
		TreeNode afterSearch = root.afterSearch(i);
		return afterSearch;
	}
}

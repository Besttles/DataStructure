package com.tree;

public class TreeNode {

	//权值
	private int value;
	//左节点
	private TreeNode lNode;
	//右结点
	private TreeNode rNode;

	public TreeNode(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getlNode() {
		return lNode;
	}

	public void setlNode(TreeNode lNode) {
		this.lNode = lNode;
	}

	public TreeNode getrNode() {
		return rNode;
	}

	public void setrNode(TreeNode rNode) {
		this.rNode = rNode;
	}
	//前序遍历
	public void frontShow() {
		System.out.println(value);
		if(lNode != null) {
			lNode.frontShow();
		}
		if(rNode != null) {
			rNode.frontShow();
		}
	}
	//中序遍历
	public void middleShow() {
		
		if(lNode != null) {
			lNode.middleShow();
		}
		System.out.println(value);
		if(rNode != null) {
			rNode.middleShow();
		}
	}
	//后序遍历
	public void afterShow() {
		
		if(lNode != null) {
			lNode.afterShow();
		}
		if(rNode != null) {
			rNode.afterShow();
		}
		System.out.println(value);
	}

	//前序查找
	public TreeNode fondSearch(int i) {
		TreeNode target = null;
		//如果当前的结点值为要查找的值
		if(this.value == i) {
			return this;
		}else {
			//查看左结点
			if(lNode != null) {
				target = lNode.fondSearch(i);
			}
			//如果目标结点的值为要查找的值
			if(target != null) {
				return target;
			}
			//查看右
			if(rNode != null) {
				target = rNode.fondSearch(i);
			}
			return target;
		}
	}
	//中序查找
	public TreeNode midSearch(int i) {
		TreeNode target = null;
		//看当前结点是否有左结点
		if(lNode != null) {
			target = lNode.midSearch(i);
		}
		if(this.value == i) {
			return this;
		}
		if(target!=null){
			return target;
		}
		if(rNode != null) {
			target = rNode.midSearch(i);
		}
		return target;
	}
	//后序查找
	public TreeNode afterSearch(int i ){
		TreeNode target = null;
		if(lNode!=null) {
			target = lNode.afterSearch(i);
		}
		if(target != null) {
			return target;
		}
		if(rNode != null) {
			target = rNode.afterSearch(i);
		}
		if(target != null) {
			return target;
		}
		if(this.value == i) {
			return this;
		}
		return target;
		
	}
	
}

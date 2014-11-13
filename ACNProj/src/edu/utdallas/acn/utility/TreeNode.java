package edu.utdallas.acn.utility;

import java.util.ArrayList;

public class TreeNode {
	private String nodeName;
	private SensorNode parentNode;
	private ArrayList<SensorNode> childNodeList;
	private boolean isRelayNode;
	private boolean isVisited;	
	
	public TreeNode() {
		this.nodeName = "";
		this.parentNode = new SensorNode();
		this.childNodeList = new ArrayList<SensorNode>();
		this.isRelayNode = false;
		this.isVisited = false;
	}


	public TreeNode(String nodeName, SensorNode parentNode,
			ArrayList<SensorNode> childNodeList, boolean isRelayNode, boolean isVisited) {
		
		this.nodeName = nodeName;
		this.parentNode = parentNode;
		this.childNodeList = childNodeList;
		this.isRelayNode = isRelayNode;
		this.isVisited = isVisited;
	}


	public boolean isVisited() {
		return isVisited;
	}


	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}


	public String getNodeName() {
		return nodeName;
	}


	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}


	public SensorNode getParentNode() {
		return parentNode;
	}


	public void setParentNode(SensorNode parentNode) {
		this.parentNode = parentNode;
	}


	public ArrayList<SensorNode> getChildNodeList() {
		return childNodeList;
	}


	public void setChildNodeList(ArrayList<SensorNode> childNodeList) {
		this.childNodeList = childNodeList;
	}


	public boolean isRelayNode() {
		return isRelayNode;
	}


	public void setRelayNode(boolean isRelayNode) {
		this.isRelayNode = isRelayNode;
	}
	
}

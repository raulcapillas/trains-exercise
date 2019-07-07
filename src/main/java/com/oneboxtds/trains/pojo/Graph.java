/**
 * @author rcapillas
 *
 */
package com.oneboxtds.trains.pojo;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Node> nodes;

	public Graph() {
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public void addNode(Node node) {
		if (nodes == null) {
			nodes = new ArrayList<>();
		}
		nodes.add(node);
	}

	@Override
	public String toString() {
		return "Graph [nodes=" + nodes + "]";
	}

}

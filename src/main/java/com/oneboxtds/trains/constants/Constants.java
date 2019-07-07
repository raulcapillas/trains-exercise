/**
 * @author rcapillas
 *
 */
package com.oneboxtds.trains.constants;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import org.springframework.stereotype.Service;

import com.oneboxtds.trains.pojo.Graph;
import com.oneboxtds.trains.pojo.Node;

@Service
public class Constants {

	public final int LARGE_NUMBER = 1 << 30;
	public final int VERTEX = 5;
	public PriorityQueue<Node> Queue = new PriorityQueue<Node>();

	public List<Graph> init() {

		List<Graph> GraphList = new ArrayList<Graph>();

		for (int i = 0; i <= VERTEX; i++) {
			GraphList.add(new Graph());
		}

		GraphList.get(1).addNode(new Node(2, 5));
		GraphList.get(1).addNode(new Node(4, 5));
		GraphList.get(1).addNode(new Node(5, 7));
		GraphList.get(2).addNode(new Node(3, 4));
		GraphList.get(2).addNode(new Node(5, 3));
		GraphList.get(3).addNode(new Node(4, 8));
		GraphList.get(3).addNode(new Node(5, 2));
		GraphList.get(4).addNode(new Node(5, 6));

		return GraphList;
	}

	public String getChar(int num) {
		switch (num) {
		case 1:
			return "A";
		case 2:
			return "B";
		case 3:
			return "C";
		case 4:
			return "D";
		case 5:
			return "E";
		default:
			return "";
		}
	}

	public Integer getNum(String character) {
		switch (character) {
		case "A":
			return 1;
		case "B":
			return 2;
		case "C":
			return 3;
		case "D":
			return 4;
		case "E":
			return 5;
		default:
			return -1;
		}
	}
}

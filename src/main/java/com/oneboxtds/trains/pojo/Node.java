/**
 * @author rcapillas
 *
 */
package com.oneboxtds.trains.pojo;

public class Node implements Comparable<Node> {

	public int first;
	public int second;

	public Node() {
	}

	public Node(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int compareTo(Node other) {
		if (this.second > other.second)
			return 1;
		if (this.second == other.second)
			return 0;
		return -1;
	}

	@Override
	public String toString() {
		return "Node [first=" + first + ", second=" + second + "]";
	}

}

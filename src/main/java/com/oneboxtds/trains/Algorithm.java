/**
 * @author rcapillas
 *
 */
package com.oneboxtds.trains;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneboxtds.trains.constants.Constants;
import com.oneboxtds.trains.pojo.Graph;
import com.oneboxtds.trains.pojo.Node;

@Service
public class Algorithm {

	@Autowired
	private Constants constants;

	public static final int MAX = 10005;
	private static int distance[] = new int[MAX];
	private static int previous[] = new int[MAX];

	public String dijkstra(String origin, String destination) {

		List<Graph> graphList = constants.init();
		boolean visited[] = new boolean[MAX];
		constants.Queue.add(new Node(constants.getNum(origin), 0));
		distance[constants.getNum(origin)] = 0;
		int current, adjacent, townDistance;

		for (int i = 0; i <= constants.VERTEX; i++) {
			distance[i] = constants.LARGE_NUMBER;
			visited[i] = false;
			previous[i] = -1;
		}

		while (!constants.Queue.isEmpty()) {
			current = constants.Queue.element().first;
			constants.Queue.remove();
			if (visited[current])
				continue;
			visited[current] = true;

			if (graphList.get(current).getNodes() != null) {
				for (int i = 0; i < graphList.get(current).getNodes().size(); ++i) {
					adjacent = graphList.get(current).getNodes().get(i).first;
					townDistance = graphList.get(current).getNodes().get(i).second;
					if (!visited[adjacent]) {
						if (distance[current] + townDistance < distance[adjacent]) {
							distance[adjacent] = distance[current] + townDistance;
							previous[adjacent] = current;
							constants.Queue.add(new Node(adjacent, distance[adjacent]));
						}
					}
				}
			}
		}

		int numDestination = constants.getNum(destination);
		String result = "";

		while (previous[numDestination] != -1) {
			result = constants.getChar(numDestination) + result;
			numDestination = previous[numDestination];
		}

		result = constants.getChar(numDestination) + result;

		if (distance[constants.getNum(destination)] < constants.LARGE_NUMBER) {
			return "The most short rout between " + origin + " and " + destination + " is " + result + " with distance "
					+ distance[constants.getNum(destination)];
		} else {
			return result + " No such rout";
		}
	}

}

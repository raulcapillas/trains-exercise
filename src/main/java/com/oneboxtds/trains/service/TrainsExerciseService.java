/**
 * @author rcapillas
 *
 */
package com.oneboxtds.trains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneboxtds.trains.Algorithm;

@Service
public class TrainsExerciseService {

	@Autowired
	private Algorithm algorithm;

	public TrainsExerciseService() {
	}

	public String shortWay(String origen, String destino) {
		return algorithm.dijkstra(origen, destino);
	}

}

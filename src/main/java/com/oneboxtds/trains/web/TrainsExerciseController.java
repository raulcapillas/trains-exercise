/**
 * @author rcapillas
 *
 */
package com.oneboxtds.trains.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oneboxtds.trains.service.TrainsExerciseService;

@RestController
public class TrainsExerciseController implements ErrorController {

	@Autowired
	private TrainsExerciseService trainsExerciseService;

	private static final String PATH = "/error";

	@RequestMapping(value = "/ways", method = RequestMethod.GET)
	public void ways() {
		// TODO
	}

	@RequestMapping(value = "/differentsWays/{origen:A|B|C|D|E}/{destino:A|B|C|D|E}", method = RequestMethod.GET)
	public void differentsWays() {
		// TODO
	}

	@RequestMapping(value = "/shortway/{origen:A|B|C|D|E}/{destino:A|B|C|D|E}", method = RequestMethod.GET)
	public String shortWay(@PathVariable("origen") String origen, @PathVariable("destino") String destino) {
		return trainsExerciseService.shortWay(origen, destino);
	}

	@RequestMapping(value = "/oneBox", method = RequestMethod.GET)
	public String oneBox() {
		return "Onebox";
	}

	@RequestMapping(value = PATH)
	public String error() {
		return "Error handling";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

}

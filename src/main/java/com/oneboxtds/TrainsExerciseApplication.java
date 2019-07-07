/**
 * @author rcapillas
 *
 */
package com.oneboxtds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.oneboxtds.trains" })
public class TrainsExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainsExerciseApplication.class, args);
	}

}

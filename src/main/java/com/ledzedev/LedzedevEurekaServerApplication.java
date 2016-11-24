package com.ledzedev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 24/Nov/2016.
 */
@SpringBootApplication
@EnableEurekaServer
public class LedzedevEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LedzedevEurekaServerApplication.class, args);
	}
}

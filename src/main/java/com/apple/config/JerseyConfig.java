package com.apple.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.apple.controller.HelloWorldRestController;

@Configuration

public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {

		register(HelloWorldRestController.class);

	}

}

package com.apple.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apple.model.User;
import com.apple.service.UserService;

@Component
@Path("/api/v1")
public class HelloWorldRestController {

	@Autowired
	UserService userService;

	private final Logger logger = LoggerFactory.getLogger(HelloWorldRestController.class);

	// Retrieve All Users---
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> listAllUsers() {
		logger.debug("Fetching All Users");
		return userService.findAllUsers();
	}

	// ---Retrieve Single User-----
	@GET
	@Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("id") long id) {
		logger.debug("Fetching User by id " + id);
		return userService.findById(id);
	}

}

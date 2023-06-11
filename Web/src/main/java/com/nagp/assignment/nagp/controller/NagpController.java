package com.nagp.assignment.nagp.controller;

import com.nagp.assignment.nagp.entity.Project;
import com.nagp.assignment.nagp.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class NagpController {

	@Autowired 
    private ProjectService projectservice;

	@GetMapping("/projects")
	public List<Project> getProjects()
	{
		return projectservice.getProjectsList();
	}

	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello";
	}
}

package com.nagp.assignment.nagp.service;

import com.nagp.assignment.nagp.entity.Project;
import com.nagp.assignment.nagp.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProjectService {

    @Autowired 
    private ProjectRepository projectrepository;

	public List<Project> getProjectsList(){
        return (List<Project>)
        projectrepository.findAll();
    }
}

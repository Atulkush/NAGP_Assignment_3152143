package com.nagp.assignment.nagp.service;

import com.nagp.assignment.nagp.entity.Project;
import com.nagp.assignment.nagp.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired 
    private ProjectRepository projectrepository;

	public List<Project> getProjectsList(){
        return (List<Project>)
        projectrepository.findAll();
    }
}

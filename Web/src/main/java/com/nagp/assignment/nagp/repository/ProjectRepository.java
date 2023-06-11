package com.nagp.assignment.nagp.repository;

import com.nagp.assignment.nagp.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository
	extends JpaRepository<Project, Long> {
}

package org.lg.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.lg.apirest.models.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
	Project findById(long id);

}

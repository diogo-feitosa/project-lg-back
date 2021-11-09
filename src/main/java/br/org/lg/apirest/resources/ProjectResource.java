package org.lg.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.lg.apirest.models.Project;
import org.lg.apirest.repository.ProjectRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Project")
public class ProjectResource {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@ApiOperation(value="Retorna uma lista de Projetos")
	@GetMapping("/projects")
	public List<Project> listaProjetos(){
		return projectRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um projeto unico")
	@GetMapping("/project/{id}")
	public Project listaProjetoUnico(@PathVariable(value="id") long id){
		return projectRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um projeto")
	@PostMapping("/project")
	public Project salvaProjeto(@RequestBody  Project project) {
		return projectRepository.save(project);
	}
	
	@ApiOperation(value="Deleta um projeto")
	@DeleteMapping("/project")
	public void deletaProjeto(@RequestBody Project project) {
		projectRepository.delete(project);
	}
	
	@ApiOperation(value="Atualiza um projeto")
	@PutMapping("/project")
	public Project atualizaProjeto(@RequestBody  Project project) {
		return projectRepository.save(project);
	}
}

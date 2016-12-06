package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.ProjectRepository;
import boot.model.Project;


@Service @Transactional
public class ProjectService {
	
	private final ProjectRepository projectRepository;

	public ProjectService(ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}
	public List<Project> findAll(){
		List<Project> projects = new ArrayList<Project>();
		for (Project project : projectRepository.findAll()) {
			projects.add(project);
		}
		return projects;
	}
	
	public void save(Project project){
		projectRepository.save(project);
	}
	
	public void delete(int id){
		projectRepository.delete(id);
	}
	
	public Project findProject(int id){
		return projectRepository.findOne(id);
	}
	
}


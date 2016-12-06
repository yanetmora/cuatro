package boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Project;
import boot.service.ProjectService;


public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/all-projects")
	public String allProjects(HttpServletRequest request){
		request.setAttribute("projects", projectService.findAll());
		request.setAttribute("mode", "MODE_PROJECTS");
		return "project";
	}
	
	@GetMapping("/new-project")
	public String newProject(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW_PROJECT");
		return "project";
	}
	
	@PostMapping("/save-project")
	public String saveProject(@ModelAttribute Project project, BindingResult bindingResult, HttpServletRequest request){
		projectService.save(project);
		request.setAttribute("projects", projectService.findAll());
		request.setAttribute("mode", "MODE_PROJECTS");
		return "project";
	}
	
	@GetMapping("/update-project")
	public String updateProject(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("project", projectService.findProject(id));
		request.setAttribute("mode", "MODE_UPDATE_PROJECT");
		return "project";
	}
	
	@GetMapping("/delete-project")
	public String deleteProject(@RequestParam int id, HttpServletRequest request){
		projectService.delete(id);
		request.setAttribute("projects", projectService.findAll());
		request.setAttribute("mode", "MODE_PROJECTS");
		return "project";
	}
}

package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Project;



public interface ProjectRepository extends CrudRepository<Project, Integer>{

}

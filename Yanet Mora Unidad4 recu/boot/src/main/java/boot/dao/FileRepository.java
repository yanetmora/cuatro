package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.File;


public interface FileRepository extends CrudRepository<File, Integer>{

}

package boot.service;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.FileRepository;

import boot.model.File;


@Service @Transactional
public class FileService {
	private final FileRepository fileRepository;

	public FileService(FileRepository fileRepository) {
		super();
		this.fileRepository = fileRepository;
	}
	public List<File> findAll(){
		List<File> files = new ArrayList<File>(); 
		for (File file : fileRepository.findAll()) {
			files.add(file);
		}
		return files;
	}
	
	public void save(File file){
		fileRepository.save(file);
	}
	public void delete(int id){
		fileRepository.delete(id);
	}
	
	public File findFile(int id){
		return fileRepository.findOne(id);
	}
	
	
}

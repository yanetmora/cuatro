package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.HomolSetRepository;
import boot.model.HomolSet;



@Service @Transactional
public class SalariesService {
	
	private final SalarieRepository salarieRepository;

	public SalariesService(SalarieRepository salarieRepository) {
		super();
		this.salarieRepository = salarieRepository;
	}
	public List<Salarie> findAll(){
		List<Salarie> salarie = new ArrayList<Salary>();
		for (Salary salaries : salarieRepository.findAll()) {
			salaries.add(salaries);
		}
		return salaries;
	}
	
	public void save(HomolSet homolSet){
		homolSetRepository.save(homolSet);
	}
	
	public void delete(int id){
		homolSetRepository.delete(id);
	}
	
	public HomolSet findHomolSet(int id){
		return homolSetRepository.findOne(id);
	}
	
}

package tr.com.agem.alfalms.service;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.agem.alfalms.model.Education;
import tr.com.agem.alfalms.repository.EducationRepository;

@Service
public class EducationService {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	EducationRepository repository;
	
	public EducationService() {
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Education> getEducationList(){
		
		try {
			
			String sql = "SELECT e.id,e.urun_adi FROM education e";
			Query query = em.createNativeQuery(sql);
			List<Object[]> result = (List<Object[]>) query.getResultList();
			List<Education> educationList = new ArrayList<Education>();
			for(Object[] r : result)
			{
				Education education = new Education();
				education.setId(r[0] == null ? null : Integer.parseInt(r[0].toString()));
				education.setUrun_adi(r[1] == null ? null : r[1].toString());
				educationList.add(education);
			}
			em.close();
			return educationList;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public List<Education> findAll(){
		List<Education> educations = repository.findAll();
		return educations;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

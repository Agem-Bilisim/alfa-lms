package tr.com.agem.alfalms.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import tr.com.agem.alfalms.model.EducationReport;
import tr.com.agem.alfalms.model.User;
import tr.com.agem.alfalms.repository.EducationReportRepository;
import tr.com.agem.alfalms.repository.UserRepository;
import tr.com.agem.alfalms.repository.UserRepository;
@Service
public class UserService {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	UserRepository repository;
	
	public UserService() {
		
	}
		
	@SuppressWarnings("unchecked")
	public List<User> getUserList(){
		try {
			
			String sql = "SELECT u.user_id,u.email,u.full_name,u.yetki FROM user u";
			Query query = em.createNativeQuery(sql);
			List<Object[]> result = (List<Object[]>) query.getResultList();
			List<User> userList = new ArrayList<User>();
			for(Object[] r : result) 
			{
				User user = new User();
				user.setUser_id(r[0] == null ? null : Integer.parseInt(r[0].toString()));
				user.setEmail(r[1] == null ? null : r[1].toString());
				user.setFull_name(r[2] == null ? null : r[2].toString());
				user.setYetki(r[3] == null ? null : r[3].toString());
				userList.add(user);
			}
			return userList;	
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<User> findAll(){
		List<User> users = repository.findAll();
		return users;
	}
	
	
	
	

}

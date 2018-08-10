package tr.com.agem.alfalms.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import tr.com.agem.alfalms.dto.EducationReportDto;
import tr.com.agem.alfalms.model.EducationReport;
import tr.com.agem.alfalms.repository.EducationReportRepository;

import tr.com.agem.alfalms.dto.EducationReportDto;

@Service
public class EducationReportService {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	EducationReportRepository repository;
	
	

	public EducationReportService() {

	}

	@SuppressWarnings("unchecked")
	public List<EducationReportDto> getEducationReportList() {

		EducationReport educationReport = new EducationReport(); //geçici educationReport nesnesi
		try {
		//	String sql = "SELECT * FROM education_report";
			String sql = "select er.id,er.durumu,er.sure,er.user_user_id,u.email,u.full_name,er.sinav_durumu,er.sinav_puani,er.education_id,e.urun_adi from education_report er ,user u , education e WHERE er.education_id = e.id and er.user_user_id = u.user_id";
			Query query = em.createNativeQuery(sql);
			List<Object[]> result = (List<Object[]>) query.getResultList(); //Veritabanından gelen verileri tutan liste
			List<EducationReportDto> educationReportDtoList = new ArrayList<EducationReportDto>(); // return edeceğim liste
			for(Object[] r : result)
			{
				EducationReportDto educationReportDto = new EducationReportDto();
//				for (int i = 0; i < result.size(); i++) {
					educationReportDto.setID(r[0] == null ? null : Integer.parseInt(r[0].toString()));
					educationReportDto.setDurumu(r[1] == null ? null : r[1].toString()); 
					educationReportDto.setSure(r[2] == null ? null : r[2].toString());
					educationReportDto.setUserID(r[3] == null ? null : Integer.parseInt(r[3].toString()));
					educationReportDto.setUserEmail(r[4] == null ? null : r[4].toString());
					educationReportDto.setUserFullname(r[5] == null ? null : r[5].toString());					
					educationReportDto.setSinavDurumu(r[6] == null ? null : r[6].toString());
					educationReportDto.setSinavPuani(r[7] == null ? null : Integer.parseInt(r[7].toString()));
					educationReportDto.setEducationID(r[8] == null ? null : Integer.parseInt(r[8].toString()));
					educationReportDto.setEducationUrunAdi(r[9] == null ? null : r[9].toString()); //er.getEducationUrunAdi()
					educationReportDtoList.add(educationReportDto);
				//}
			}
				
			return educationReportDtoList;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<EducationReport> findAll(){
		List<EducationReport> educationReports = (List<EducationReport>) repository.findAll();
		return educationReports;
	}
	
	
	

}

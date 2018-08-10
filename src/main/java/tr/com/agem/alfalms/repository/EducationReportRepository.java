package tr.com.agem.alfalms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.agem.alfalms.model.EducationReport;
import org.springframework.jdbc.core.JdbcTemplate;

public interface EducationReportRepository extends JpaRepository<EducationReport, Long>{
	
	// public List<EducationReport> findAll();
}

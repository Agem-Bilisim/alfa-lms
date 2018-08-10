package tr.com.agem.alfalms.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "education_report")
public class EducationReport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false, updatable = false)
	private Long id;
	
	//private HashSet<EducationReport> educationReports = new HashSet<EducationReport>(0);
	
	@Column(name = "DURUMU", nullable = false)
	private String durumu;
	
	@Column(name = "SURE", nullable = false) //DEFAULT - 00:00:00
	private String sure;
	
	@JsonProperty("sinav_durumu")
	@Column(name = "SINAV_DURUMU", nullable = false)
	private String sinavDurumu;
	
	@JsonProperty("sinav_puani")
	@Column(name = "SINAV_PUANI", nullable = false) 
	private int sinavPuani;
	
	@ManyToOne
	private Education education;
	
	@ManyToOne
	private User user;
	
	
	//constructor
	public EducationReport() {
		this.sure = "00:00:00";
	}
	
	
	public Long getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = (long) id ;
	}
	
	public String getUserEmail() {
		return this.user.getEmail();
	}
	
	public void setUserEmail(String email) {
		this.user.setEmail(email);
	}
	
	public String getUserFullName() {
		return this.user.getFull_name();
	}
	
	public void setUserFullName(String full_name) {
		this.user.setFull_name(full_name);
	}
	
	public int getUserID() {
		return this.user.getUser_id();
	}
	
	public void setUserID(int id) {
		this.user.setUser_id(id);
	}
	
	public int getEducationID() {
		return this.education.getId();
	}
	
	public void setEducationID(int id) {
		this.education.setId(id);
	}
	
	public String getEducationUrunAdi() {
		return this.education.getUrun_adi();
	}
	
	public void setEducationUrunAdi(String urun_adi) {
		this.education.setUrun_adi(urun_adi);
	}
	
	public String getDurumu() {
		return this.durumu;
	}
	
	public void setDurumu(String durumu) {
		this.durumu = durumu;
	}
	
	public String getSure() {
		return this.sure;
	}
	
	public void setSure(String sure) {
		this.sure = sure;
	}
	
	public String getSinavDurumu() {
		return this.sinavDurumu;
	}
		
	public void setSinavDurumu(String sinav_durumu) {
		this.sinavDurumu = sinav_durumu;
	}
	
	public int getSinavPuani(){
		return this.sinavPuani;
	}
	
	public void setSinavPuani(int sinav_puani) {
		this.sinavPuani = sinav_puani;
	}	
	
	/*public HashSet<EducationReport> getEducationReports() {
		return educationReports;
	}

	public void setEducationReports(HashSet<EducationReport> educationReports) {
		this.educationReports = educationReports;
	}
	
	public void addEducationReport(EducationReport educationReport) {
		if (this.educationReports == null) {
			this.educationReports = new HashSet<EducationReport>();
		}
		this.educationReports.add(educationReport);
	}*/

	
	
	
	
	
	
	
	
}

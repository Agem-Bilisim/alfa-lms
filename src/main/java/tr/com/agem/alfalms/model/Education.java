package tr.com.agem.alfalms.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "education")
public class Education {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false, unique = true)
	private int id;
	
	@JsonProperty("urun_adi")
	@Column(name = "URUN_ADI", nullable = false, unique = true)
	private String urunAdi;
	
	/*
	@Column(name = "KATILIM_SAYISI")
	private String katilim_sayisi;
	*/
	/*
	@ManyToMany
	private Collection<User> users = new ArrayList<User>();
	*/
	
	@OneToMany
	private Collection<EducationReport> educationReports = new ArrayList<EducationReport>();
		
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setUrun_adi(String urun_adi) {
		this.urunAdi = urun_adi;
	}
	
	public String getUrun_adi() {
		return this.urunAdi;
	}
}

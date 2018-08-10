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
@Table(name = "user")
public class User {
	
	
	@JsonProperty("user_id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", nullable = false, unique = true)
	private int userId;
	
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;
	
	@JsonProperty("full_name")
	@Column(name = "FULL_NAME")
	private String fullName;

	@Column(name = "YETKI")
	private String yetki;	
	
	/*
	@ManyToMany(mappedBy = "users")
	private Collection <Education> educations = new ArrayList<Education>(); 
	*/
	
	@OneToMany
	private Collection<EducationReport> educationReports = new ArrayList<EducationReport>();
	

	
	public void setUser_id(int user_id) {
		this.userId = user_id;
	}
	public int getUser_id() {
		return this.userId;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	public void setFull_name(String full_name) {
		this.fullName = full_name;
	}
	public String getFull_name() {
		return this.fullName;
	}
	public void setYetki(String yetki) {
		this.yetki = yetki;
	}
	public String getYetki() {
		return this.yetki;
	}
	
	

}

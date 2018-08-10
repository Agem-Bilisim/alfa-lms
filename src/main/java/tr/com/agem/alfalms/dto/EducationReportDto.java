package tr.com.agem.alfalms.dto;

import javax.persistence.Entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EducationReportDto {
	
	private Long id;
	private String durumu;
	private String sure;
	private int user_id;
	private String user_email;
	private String user_fullname;
	private String sinav_durumu;
	private int sinav_puani;
	private int education_id;
	private String education_urun_adi;
	
	public EducationReportDto() {
		
	}
	
	public Long getID() {
		return id;
	}	
	public void setID(int id) {
		this.id = (long)id;
	}
	
	public String getDurumu() {
		return durumu;
	}	
	public void setDurumu(String durumu) {
		this.durumu = durumu;
	}
	
	public String getSure() {
		return sure;
	}
	public void setSure(String sure) {
		this.sure = sure;
	}
	
	public int getUserID() {
		return user_id;
	}
	public void setUserID(int user_id) {
		this.user_id = user_id;
	}
	
	public String getUserEmail() {
		return user_email;
	}
	public void setUserEmail(String user_email) {
		this.user_email = user_email;
	}
	
	public String getUserFullname() {
		return user_fullname;
	}
	public void setUserFullname(String user_fullname) {
		this.user_fullname = user_fullname;
	}
	
	public String getSinavDurumu() {
		return sinav_durumu;
	}
	public void setSinavDurumu(String sinav_durumu) {
		this.sinav_durumu = sinav_durumu;
	}
	
	public int getSinavPuani() {
		return sinav_puani;
	}
	public void setSinavPuani(int sinav_puani) {
		this.sinav_puani = sinav_puani;
	}
	
	public int getEducationID() {
		return education_id;
	}
	public void setEducationID(int education_id) {
		this.education_id = education_id;
	}
	
	public String getEducationUrunAdi() {
		return education_urun_adi;
	}
	public void setEducationUrunAdi(String education_urun_adi) {
		this.education_urun_adi = education_urun_adi;
	}
	
	
}

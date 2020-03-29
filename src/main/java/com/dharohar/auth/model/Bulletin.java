package com.dharohar.auth.model;
import javax.persistence.*;


@Entity
@Table(name = "bulletin")
public class Bulletin {
	
	private Long id;
	private String bulletinr_healing;
	private String bulletin_description;
	private String created_at;
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBulletinr_healing() {
		return bulletinr_healing;
	}
	public void setBulletinr_healing(String bulletinr_healing) {
		this.bulletinr_healing = bulletinr_healing;
	}
	public String getBulletin_description() {
		return bulletin_description;
	}
	public void setBulletin_description(String bulletin_description) {
		this.bulletin_description = bulletin_description;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	
	
}

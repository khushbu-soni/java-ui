package com.dharohar.auth.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tree")
public class Tree {
	
	private Long id;
	private String name;
	private String image;
	private String tree_health;
	private String location;
	private User user;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
		
	
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTree_health() {
		return tree_health;
	}

	public void setTree_health(String tree_health) {
		this.tree_health = tree_health;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}

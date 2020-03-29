package com.dharohar.auth.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "blog")
public class Blog {
	
	
	private Long id;
	private String article_title;
	private String article_content;
	private String article_status;
	private String created_at;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	public String getArticle_title() {
		return article_title;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public String getArticle_content() {
		return article_content;
	}

	public void setArticle_content(String article_content) {
		this.article_content = article_content;
	}

	public String getArticle_status() {
		return article_status;
	}

	public void setArticle_status(String article_status) {
		this.article_status = article_status;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	
	
	
}

package com.dharohar.auth.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dharohar.auth.model.Blog;
import com.dharohar.auth.model.Tree;
import com.dharohar.auth.repository.BlogRepository;
import com.dharohar.auth.repository.TreeRepository;

public class BlogServiceImpl implements BlogService {

	@Autowired
    private BlogRepository blogRepository;
   
    @Autowired
    UserService userService;
    
    @Autowired
    SecurityService securityServices;
    
    public void save(Blog blog) {
        blog.setArticle_title(blog.getArticle_title());
        blog.setArticle_content(blog.getArticle_content());

        blogRepository.save(blog);
    }


	public Blog findByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}

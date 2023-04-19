package com.javatpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Books;
import com.javatpoint.model.Email;
import com.javatpoint.repository.BooksRepository;
import com.javatpoint.repository.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	EmailRepository emailRepository;
	
	public void sendEmail() {
		// use mailSender here...
	}
	public void saveOrUpdate(Email email) 
	{
		emailRepository.save(email);
}
}

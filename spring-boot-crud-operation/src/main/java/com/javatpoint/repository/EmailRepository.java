package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.javatpoint.model.Books;
import com.javatpoint.model.Email;
public interface EmailRepository extends CrudRepository<Email, Integer>
{
}

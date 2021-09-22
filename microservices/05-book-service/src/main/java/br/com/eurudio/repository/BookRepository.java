package br.com.eurudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eurudio.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	
	
	
}

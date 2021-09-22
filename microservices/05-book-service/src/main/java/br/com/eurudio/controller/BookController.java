package br.com.eurudio.controller;



import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.eurudio.model.Book;
import br.com.eurudio.proxy.CambioProxy;
import br.com.eurudio.repository.BookRepository;
import br.com.eurudio.response.Cambio;

@RestController 
@RequestMapping("book-service")
public class BookController {
	
	  @Autowired
	  private Environment environment;
	  

	  @Autowired
	  private BookRepository repository;
	  
	  @Autowired
	  private CambioProxy proxy;
	  
	  
	  

	@GetMapping(value = "/{id}/{currency}")
	public Book findBook( @PathVariable("id") Long id,  
			@PathVariable("currency") String currency
			
			) {
		
		
		var book = repository.getById(id);  
		
		if(book == null) throw new RuntimeException("Book not Found");
	
		var cambio = proxy.getCambio(book.getPrice(), "USD", currency);
		
		
	
		
		var port = environment.getProperty("local.server.port");
		
	
		book.setEnvironment(port);
		book.setPrice(cambio.getConvertedValue());
		return book;
		
	}
	
	
	
	
	
	
	
	
	
}

package br.com.eurudio.response;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;




public class Cambio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	private long id; 
   
   
	private String from; 
    
	private String to; 
	

	private String environment;
	
	private Double conversionFactor; 
	 
	
	private Double convertedValue;
	
	
	public Cambio() {
		
	}

	
	
	

	public Cambio(long id, String from, String to, String environment, Double conversionFactor, Double convertedValue) {
		
		this.id = id;
		this.from = from;
		this.to = to;
		this.environment = environment;
		this.conversionFactor = conversionFactor;
		this.convertedValue = convertedValue;
	}





	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getEnvironment() {
		return environment;
	}


	public void setEnvironment(String environment) {
		this.environment = environment;
	}


	public Double getConversionFactor() {
		return conversionFactor;
	}


	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}


	public Double getConvertedValue() {
		return convertedValue;
	}


	public void setConvertedValue(Double convertedValue) {
		this.convertedValue = convertedValue;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
	
	
	
	
	
	
	
	
}

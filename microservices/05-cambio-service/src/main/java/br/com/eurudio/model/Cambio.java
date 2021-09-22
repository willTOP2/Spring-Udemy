package br.com.eurudio.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;



@Entity
public class Cambio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
   @Id 
   @GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
   
    @Column(name = "from_currency", nullable = false, length = 3)
	private String from; 
    
    @Column(name = "to_currency", nullable = false, length = 3)
	private String to; 
	
	@Transient
	private String environment;
	
	 @Column(nullable = false)
	private BigDecimal conversionFactor; 
	 
	 @Transient
	private BigDecimal convertedValue;
	
	
	public Cambio(long id, String from, String to,  BigDecimal conversionFactor,
			BigDecimal convertedValue, String environment) {
		
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.convertedValue = convertedValue;
		this.environment = environment;
		
	}
	

	public Cambio() {
		
	}


	public long getId() {
		return id;
	}


	public String getFrom() {
		return from;
	}


	public String getTo() {
		return to;
	}


	public String getEnvironment() {
		return environment;
	}


	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}


	public BigDecimal getConvertedValue() {
		return convertedValue;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public void setEnvironment(String environment) {
		this.environment = environment;
	}


	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}


	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}
	
	
	
	
	
	
	
	
	
	
}

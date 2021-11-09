package org.lg.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TB_PROJECT")
public class Project implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	
	private String name;
	
    private LocalDate startDate;
    
    private LocalDate endDate;
    
    private Double value;    
    
    private RiskEnum risk;
    
    public enum RiskEnum {
		low("0"),		
		medium("1"), 			
		high("2");
		
		private String description;
		
		RiskEnum(String description){
			this.description = description;
		}

		public String getDescription(){
			return this.description;
		}
	};
    	
	public long getId(){
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public RiskEnum getRisk() {
		return risk;
	}
	public void setRisk(RiskEnum risk) {
		this.risk = risk;
	}
}

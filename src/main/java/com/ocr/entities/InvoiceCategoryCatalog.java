package com.ocr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class InvoiceCategoryCatalog {


 	@Id
    private String id;
    private String category;
    private String owner;
    
    public InvoiceCategoryCatalog() {
    }
    
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}




}

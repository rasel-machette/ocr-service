package com.ocr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoice_type_catalog")
public class InvoiceTypeCatalog {

	@Id
	private String id;
	private String type;
	private String owner;

	public InvoiceTypeCatalog() {
	}

	public InvoiceTypeCatalog(String id, String type, String owner) {
		super();
		this.id = id;
		this.type = type;
		this.owner = owner;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

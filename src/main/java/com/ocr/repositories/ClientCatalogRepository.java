package com.ocr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ocr.entities.ClientCatalog;

public interface ClientCatalogRepository extends JpaRepository<ClientCatalog, String> {

	List<ClientCatalog> findByowner(String owner);
	
}

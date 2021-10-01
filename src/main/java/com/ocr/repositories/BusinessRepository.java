package com.ocr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ocr.model.Business;

public interface BusinessRepository extends JpaRepository<Business, String> { 
	
	List<Business> findByowner(String owner);

}

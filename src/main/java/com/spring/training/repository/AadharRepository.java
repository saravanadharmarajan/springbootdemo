package com.spring.training.repository;


import org.springframework.data.repository.CrudRepository;  
import com.spring.training.model.CitizenAadhar;  
public interface AadharRepository extends CrudRepository<CitizenAadhar, Integer>  
{  
} 
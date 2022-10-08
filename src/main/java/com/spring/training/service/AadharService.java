package com.spring.training.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.training.model.CitizenAadhar;
import com.spring.training.repository.AadharRepository;

@Service
public class AadharService {
	@Autowired
	AadharRepository aadharRepository;

//getting all student records  
	public List<CitizenAadhar> getAllCitizens() {
		List<CitizenAadhar> citizens = new ArrayList<CitizenAadhar>();
		aadharRepository.findAll().forEach(citizen -> citizens.add(citizen));
		return citizens;
	}

//getting a specific record  
	public CitizenAadhar getCitizenByAadhar(int aadharid) {
		return aadharRepository.findById(aadharid).get();
	}

	public void saveOrUpdate(CitizenAadhar citizen) {
		aadharRepository.save(citizen);
	}

//deleting a specific record  
	public void delete(int id) {
		aadharRepository.deleteById(id);
	}
}
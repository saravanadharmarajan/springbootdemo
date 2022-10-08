package com.spring.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.training.model.CitizenAadhar;
import com.spring.training.service.AadharService;  
//creating RestController  
@RestController
@RequestMapping("/services/*")
public class AadharController   
{  
//autowired the aadharService class  
@Autowired  
AadharService aadharService;  
//creating a get mapping that retrieves all the students detail from the database   
@GetMapping(value = "/getcitizens")
private List<CitizenAadhar> getAllStudent()   
{  
	System.out.println("Hitting this service..");
	return aadharService.getAllCitizens();  
}  
//creating a get mapping that retrieves the detail of a specific student  
@GetMapping("/citizen/{aadharid}")  
private CitizenAadhar getCitizenDetails(@PathVariable("aadharid") int id)   
{  
return aadharService.getCitizenByAadhar(id);  
}  
//creating a delete mapping that deletes a specific student  
@DeleteMapping("/deletecitizen/{id}")  
private void deleteCitizenDetails(@PathVariable("id") int id)   
{  
aadharService.delete(id);  
}  
//creating post mapping that post the citizen detail in the database  
@PostMapping("/updatecitizen")  
private int saveStudent(@RequestBody CitizenAadhar citizen)   
{  
	System.out.println("Invoking this service..");
	aadharService.saveOrUpdate(citizen);  
return citizen.getId();  
}  
}  
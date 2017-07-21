package com.mikauran.vehicleboard.controllers;

import com.mikauran.vehicleboard.repository.VehicleSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mikauran.vehicleboard.model.Vehicle;
import com.mikauran.vehicleboard.repository.VehicleRepository;

@Controller
public class VehicleController {
	@Autowired VehicleRepository carRepo;
	@Autowired VehicleSearchRepository carSearchRepo;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("carList", carRepo.findAll());
		return "home";
	} 
	
	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String addCar(@ModelAttribute Vehicle car) {
		carRepo.save(car);
		return "redirect:home";
	}
	
	@RequestMapping(value = "/search")
	public String search(Model model, @RequestParam String search) {
		model.addAttribute("carList", carSearchRepo.searchCars(search));
		model.addAttribute("search", search);
		return "home";
	}
	
//	@RequestMapping("/error")
//	public String error(Model model) {
//	
//		return "error";
//	} 

	
}

package com.dhairya.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhairya.crm.dao.CustomerServiceDao;
import com.dhairya.crm.model.Customer;


@Controller
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	CustomerServiceDao customerServicedao;

	@GetMapping("customerList")
	public String showCustomer(Model model) {
		List<Customer> customer = customerServicedao.findAll();
		model.addAttribute("customer", customer);
		return "customer-list";
	}

	@GetMapping("showCustomerForm")
	public String showCustomerForm(Model model) {
		Customer customer =new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}

	@PostMapping("saveCustomer")
	public String saveCustomer(Model model,
			@ModelAttribute("customer")Customer customer) {
		customerServicedao.saveCustomer(customer);
		return "redirect:/customer/customerList";
	}

	@GetMapping("updateCustomer")
	public String updateCustomer(Model model,
			@RequestParam("id") int id) {
		 Customer customer = customerServicedao.findCustomerById(id);
		 model.addAttribute("customer", customer);
		return "customer-update-form";
	}


	@GetMapping("deleteCustomer")
	public String deleteCustomer(Model model,
			@RequestParam("id") int id) {
		customerServicedao.deleteCustomerById(id);
		 return "redirect:/customer/customerList";
	}
	
	

}

package com.mortgage.managerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mortgage.managerservice.model.LoanDetails;
import com.mortgage.managerservice.service.ManagerServiceImpl;




@RestController
@RequestMapping("/manager-service")
public class ManagerController {
		@Autowired
        private ManagerServiceImpl managerServiceImpl;
	    
		
		/**To Search All customer Details For manager**/
		@GetMapping("/all")
		public List<LoanDetails> getAllDetails() {
			return managerServiceImpl.getAllDetails();
		}
		
		/**To Search customer Using CustomerId For manager**/
		@GetMapping("/view")
		public LoanDetails getDetailsByCustomerId(@PathVariable Integer customerId) {
			return managerServiceImpl.getDetailsByCustomerId(customerId);
		}
		
		/**To Update customers Using customerId & customerDetails For manager**/
		@PutMapping("/update/{cid}")
		public String updatecustomerDetails(@PathVariable Integer customerId, 
				@RequestBody LoanDetails customerDetails) {
			managerServiceImpl.updateLoanDetails(customerId, customerDetails);
			return ("Updated customerDetails Details With customer Id  -" + customerDetails.getCustomerId() + " Successfully..!!");
		}
	    
		/**To Delete customers Using customerId For manager**/
		@DeleteMapping("/delete/{cid}")
		public String deleteCustomerDetails(@PathVariable Integer customerId) {
			managerServiceImpl.deleteLoanDetails(customerId);
			return ("Removed customer Details With customer Id number -" + customerId);
		}

	
}

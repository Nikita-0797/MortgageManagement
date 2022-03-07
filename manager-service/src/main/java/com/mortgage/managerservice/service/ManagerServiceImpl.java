package com.mortgage.managerservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgage.managerservice.exception.ResourceNotFoundException;
import com.mortgage.managerservice.model.LoanDetails;
import com.mortgage.managerservice.repository.ManagerRepository;


@Service
public class ManagerServiceImpl implements ManagerService {
	

	@Autowired
	private ManagerRepository managerRepository;

	@Override
	public List<LoanDetails> getAllDetails() {
		List<LoanDetails> products = managerRepository.findAll();

		return products;
	}

	@Override
	public LoanDetails getDetailsByCustomerId(int customerId) throws ResourceNotFoundException {
		Optional<LoanDetails> optionalLoanDetails = managerRepository.findById(customerId);

		if (optionalLoanDetails.isEmpty()) {

			throw new ResourceNotFoundException("Sorry! Customer not found with id" + customerId);

		}
		return optionalLoanDetails.get();
	}

	@Override
	public LoanDetails updateLoanDetails(int customerId, LoanDetails loanDetails) {
		 Optional<LoanDetails> optionalLoanDetails = managerRepository.findById(loanDetails.getCustomerId());
			
			if(optionalLoanDetails.isEmpty()) {
				
				throw new ResourceNotFoundException("Sorry! Customer not found with id" +loanDetails.getCustomerId());
				
			}
			
			LoanDetails updatedLoanDetails = managerRepository.save(loanDetails);
			return updatedLoanDetails;
		}


	@Override
	public void deleteLoanDetails(int customerId) {	
     Optional<LoanDetails> optionalLoanDetails = managerRepository.findById(customerId);
		
		if(optionalLoanDetails.isPresent()) {
			
			managerRepository.deleteById(customerId);
			
		}
		
		else {
			throw new ResourceNotFoundException("sorry Customer is not existing with id:" +customerId);
		}
		
	}

}
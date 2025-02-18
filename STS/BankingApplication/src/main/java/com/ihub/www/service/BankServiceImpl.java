package com.ihub.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihub.www.dao.BankDao;
import com.ihub.www.entity.Bank;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDao bankDao;

	@Override
	public Bank getBankById(int bankId) {
		return this.bankDao.findById(bankId).get(bankId);
	}

	@Override
	public Bank addBank(Bank bank) {
		return this.bankDao.save(bank);
	}

	@Override
	public Bank updateBank(Bank bank) {
		return this.bankDao.save(bank);
	}

	@Override
	public List<Bank> getAllBank() {
		return this.bankDao.findAll();
	}

	
	
	
	
//	@Override
//	public Bank registerBank(Bank bank) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Bank> getByBank(int bankId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Bank> getByNumberContainingIgnoreCaseAndBank(String accountNumber, int bankId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}

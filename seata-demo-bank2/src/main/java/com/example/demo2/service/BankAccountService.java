package com.example.demo2.service;

import com.example.demo2.entity.BankAccount;
import com.example.demo2.repository.BankAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Brian
 */
@Service
public class BankAccountService {

    @Resource
    private BankAccountRepository bankAccountRepository;

    @Transactional
    public BankAccount addValue(Long id, Long value) {

        BankAccount account = bankAccountRepository.findById(id).get();
        account.setValue(account.getValue() + value);
        bankAccountRepository.save(account);

        if(value.intValue() == 3){
            throw new RuntimeException("aaaaaaaaa");
        }
        return account;
    }
}

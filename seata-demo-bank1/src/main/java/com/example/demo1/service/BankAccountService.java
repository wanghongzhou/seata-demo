package com.example.demo1.service;

import com.example.demo1.enitty.BankAccount;
import com.example.demo1.feign.Bank2Service;
import com.example.demo1.repository.BankAccountRepository;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author Brian
 */
@Service
public class BankAccountService {

    @Resource
    private Bank2Service bank2Service;

    @Resource
    private BankAccountRepository bankAccountRepository;

    @Transactional
    @GlobalTransactional
    public BankAccount costValue(Long id, Long value) {
        BankAccount account= bankAccountRepository.findById(id).get();
        account.setValue(account.getValue() - value);
        bankAccountRepository.save(account);
        bank2Service.addBank2Value(2L, value);

        if(value.intValue() == 2){
            throw new RuntimeException("aaaaaaaaaaaaa");
        }
        return account;
    }
}

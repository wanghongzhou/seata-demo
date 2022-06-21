package com.example.demo1.repository;

import com.example.demo1.enitty.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Brian
 */
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}

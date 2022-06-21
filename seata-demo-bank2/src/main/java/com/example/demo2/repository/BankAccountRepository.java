package com.example.demo2.repository;

import com.example.demo2.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Brian
 */
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}

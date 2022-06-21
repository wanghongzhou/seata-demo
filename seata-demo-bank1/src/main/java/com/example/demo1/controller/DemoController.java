package com.example.demo1.controller;

import com.example.demo1.enitty.BankAccount;
import com.example.demo1.service.BankAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Brian
 */
@RestController
public class DemoController {

    @Resource
    private BankAccountService bankAccountService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/{id}/{value}")
    public BankAccount hello(@PathVariable Long id, @PathVariable Long value) {
        return bankAccountService.costValue(id, value);
    }
}

package com.example.demo2.controller;

import com.example.demo2.entity.BankAccount;
import com.example.demo2.service.BankAccountService;
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
    public BankAccount hello(@PathVariable Long id,@PathVariable Long value) {
        return bankAccountService.addValue(id, value);
    }
}

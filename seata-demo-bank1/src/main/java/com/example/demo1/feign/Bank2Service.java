package com.example.demo1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Brian
 */
@FeignClient(name = "seata-deme-bank2")
public interface Bank2Service {

    @GetMapping("/hello/{id}/{value}")
    void addBank2Value(@PathVariable  Long id, @PathVariable Long value);
}

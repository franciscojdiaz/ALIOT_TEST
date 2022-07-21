package com.aliot.prueba.service.controller;


import com.aliot.prueba.service.OperationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class OperationController {

    @Autowired
    private OperationService operationService;

    @RequestMapping(value = "api/oper/{num1}/{num2}/{operator}", method = RequestMethod.GET)
    public String getResul(@PathVariable("num1") String num1, @PathVariable("num2") String num2, @PathVariable("operator") String operator){
        String resutt = null;
        log.info("operation executed by controller");
        resutt = operationService.operation(Integer.parseInt(num1),Integer.parseInt(num2),operator);
        System.out.println("operation executed by controller :: " +resutt);
        return resutt;
    }

}

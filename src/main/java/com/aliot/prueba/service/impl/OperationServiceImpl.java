package com.aliot.prueba.service.impl;


import com.aliot.prueba.service.OperationService;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {


    @Override
    public String operation(int num1, int num2 , String oper) {

        int result = 0;

        if(oper.equals("add")){
            result = num1 + num2;
        }else{
            result = num1 - num2;
        }
        return String.valueOf(result);
    }
}

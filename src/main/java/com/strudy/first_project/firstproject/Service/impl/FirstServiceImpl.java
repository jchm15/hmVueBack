package com.strudy.first_project.firstproject.Service.impl;

import com.strudy.first_project.firstproject.Service.FirstService;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {

    @Override
    public String helloWorld() {
        return "Hello World";
    }
}

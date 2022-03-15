package com.strudy.first_project.firstproject.Controller;

import com.strudy.first_project.firstproject.Service.FirstService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/first")
public class FirstController {
    private final FirstService firstService;

    @GetMapping("/0001")
    public ResponseEntity<String> getFirst(){
        String result = firstService.helloWorld();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}

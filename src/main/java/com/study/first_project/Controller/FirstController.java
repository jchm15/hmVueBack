package com.study.first_project.Controller;

import com.study.first_project.Service.FirstService;
import com.study.first_project.VO.MmbrVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/first")
public class FirstController {
    private final FirstService firstService;

    @GetMapping("/0001")
    public ResponseEntity<List<MmbrVO>> getFirst(){
        List<MmbrVO> result = firstService.helloWorld();
        return new ResponseEntity<List<MmbrVO>>(result, HttpStatus.OK);
    }

}
package com.study.first_project.Controller;

import com.study.first_project.Service.FirstService;
import com.study.first_project.VO.MmbrVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class FirstController {
    private final FirstService firstService;


    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found2")
    })
    @ApiOperation(value = "회원 목록 조회", notes = "회원 목록 조회 API입니다.")
    @GetMapping("/sample")
    public ResponseEntity<List<MmbrVO>> getFirst(){
        List<MmbrVO> result = firstService.helloWorld();
        return new ResponseEntity<List<MmbrVO>>(result, HttpStatus.OK);
    }

}
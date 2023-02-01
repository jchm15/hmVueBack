package com.study.first_project.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.study.first_project.Service.FirstService;
import com.study.first_project.VO.MmbrVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class FirstController {
    private final FirstService firstService;


    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found2")
    })
    @ApiOperation(value = "회원 목록 조회", notes = "회원 목록 조회 API")
    @GetMapping("/select")
    public ResponseEntity<List<MmbrVO>> getMember(){
        List<MmbrVO> result = firstService.selectMember();
        return new ResponseEntity<List<MmbrVO>>(result, HttpStatus.OK);
    }


    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found2")
    })
    @ApiOperation(value = "회원 입력", notes = "회원 입력 API")
    @PostMapping(value = "/insert")
    public ResponseEntity<MmbrVO> addMember(@RequestBody MmbrVO params){
        System.out.println(params.getMmbrId());
        System.out.println(params.getMmbrNm());
        System.out.println(params.getMmbrPwd());

        try {
            int result = firstService.insertMember(params);
            return new ResponseEntity<>(params, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(params, HttpStatus.BAD_REQUEST);
        }

//        return new ResponseEntity<List<MmbrVO>>(result, HttpStatus.OK);
    }
}
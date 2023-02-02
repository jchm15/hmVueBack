package com.study.first_project.Controller;

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
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found2")
    })
    @ApiOperation(value = "회원 입력", notes = "회원 입력 API")
    @PostMapping(value = "/insert")
    public ResponseEntity<MmbrVO> addMember(@RequestBody MmbrVO params){
        try {
            firstService.insertMember(params);
            return new ResponseEntity<>(params, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(params, HttpStatus.BAD_REQUEST);
        }
    }

    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found2")
    })
    @ApiOperation(value = "회원 삭제", notes = "회원 삭제 API")
    @PostMapping(value = "/delete")
    public ResponseEntity<MmbrVO> deleteMember(@RequestBody MmbrVO params){
        try {
            firstService.deleteMember(params);
            return new ResponseEntity<>(params, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(params, HttpStatus.BAD_REQUEST);
        }
    }

    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found2")
    })
    @ApiOperation(value = "회원 수정", notes = "회원 수정 API")
    @PostMapping(value = "/update")
    public ResponseEntity<MmbrVO> updateMember(@RequestBody MmbrVO params){
        try {
            firstService.updateMember(params);
            return new ResponseEntity<>(params, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(params, HttpStatus.BAD_REQUEST);
        }
    }
}
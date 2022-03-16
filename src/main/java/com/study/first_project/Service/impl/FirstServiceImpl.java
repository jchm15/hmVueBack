package com.study.first_project.Service.impl;

import com.study.first_project.DAO.FirstDAO;
import com.study.first_project.Service.FirstService;
import com.study.first_project.VO.MmbrVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FirstServiceImpl implements FirstService {

    private final FirstDAO dao;

    @Override
    public List<MmbrVO> helloWorld() {
        return dao.selectMmbrList();
    }
}

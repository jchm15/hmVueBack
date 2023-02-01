package com.study.first_project.Service.impl;

import com.study.first_project.DAO.FirstDAO;
import com.study.first_project.Service.FirstService;
import com.study.first_project.VO.MmbrVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class FirstServiceImpl implements FirstService {

    private final FirstDAO dao;

    @Override
    public List<MmbrVO> helloWorld() {
        return dao.selectMmbrList();
    }

    @Override
    public List<MmbrVO> selectMember() {
        return dao.selectMmbrList();
    }

    @Override
    public int insertMember(MmbrVO params) {
        return dao.insertMember(params);
    }
}

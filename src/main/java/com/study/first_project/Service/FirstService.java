package com.study.first_project.Service;

import com.study.first_project.VO.MmbrVO;

import java.util.List;
import java.util.Map;

public interface FirstService {
    public List<MmbrVO> selectMember();

    public int insertMember(MmbrVO params);

    public int deleteMember(MmbrVO params);

    public int updateMember(MmbrVO params);
}

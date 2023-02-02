package com.study.first_project.DAO;

import com.study.first_project.VO.MmbrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FirstDAO {
    List<MmbrVO> selectMmbrList();

    int insertMember(MmbrVO param);

    int deleteMember(MmbrVO param);

    int updateMember(MmbrVO param);
}

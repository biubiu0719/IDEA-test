package com.biubiu.demo.dao;

import com.biubiu.demo.model.Hhh;
import com.biubiu.demo.model.HhhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HhhMapper {
    long countByExample(HhhExample example);

    int deleteByExample(HhhExample example);

    int deleteByPrimaryKey(String dassad);

    int insert(Hhh record);

    int insertSelective(Hhh record);

    List<Hhh> selectByExample(HhhExample example);

    int updateByExampleSelective(@Param("record") Hhh record, @Param("example") HhhExample example);

    int updateByExample(@Param("record") Hhh record, @Param("example") HhhExample example);
}
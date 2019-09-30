package com.example.mapper;

import org.springframework.stereotype.Repository;

import com.example.entity.G2ParaInfoManage;
import tk.mybatis.mapper.common.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface G2ParaInfoManageMapper extends Mapper<G2ParaInfoManage> {
}
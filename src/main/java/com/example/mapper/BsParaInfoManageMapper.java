package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.BsParaInfoManage;
import tk.mybatis.mapper.common.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface BsParaInfoManageMapper extends Mapper<BsParaInfoManage> {
	
	List<BsParaInfoManage> selectByBsType(@Param("bsType")String bsType);
}
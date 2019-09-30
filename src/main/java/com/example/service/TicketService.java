package com.example.service;

import java.util.List;

import com.example.entity.BsParaInfoManage;

public interface TicketService {
	
	List<BsParaInfoManage> listBs();
	
	/**
	 * 获取投诉点对应的黑点库
	 * @param lng
	 * @param lat
	 * @param problemId	投诉类型
	 * @return	返回对应口径
	 */
	String getBlackSpotCaliber(String lng,String lat,String problemId);
	
	/**
	 * 获取投诉点谁赢的批量故障
	 * @param lng
	 * @param lat
	 * @param problemId	投诉类型
	 * @return	返回对应口径
	 */
	String getBsCaliber(String lng,String lat,String problemId);
}

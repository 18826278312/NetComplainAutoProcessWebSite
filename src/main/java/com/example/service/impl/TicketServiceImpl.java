package com.example.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.example.entity.BlackSpotInfoManage;
import com.example.entity.BsParaInfoManage;
import com.example.mapper.BlackSpotInfoManageMapper;
import com.example.mapper.BsParaInfoManageMapper;
import com.example.service.TicketService;
import com.example.util.Point;

@Service
public class TicketServiceImpl implements TicketService{
	
	@Resource
	BsParaInfoManageMapper bsParaInfoManageMapper;
	@Resource
	BlackSpotInfoManageMapper blackSpotInfoManageMapper;
	
	@Override
	public List<BsParaInfoManage> listBs() {
		return bsParaInfoManageMapper.selectAll();
	}
		
	@Override
	public String getBlackSpotCaliber(String lng, String lat, String problemId) {
		List<BlackSpotInfoManage> list = blackSpotInfoManageMapper.selectAll();
		Point point = new Point();
		for(int i=0;i<list.size();i++){
			if(point.isInPolygon(list.get(i).getSpotGaode(), lng, lat)){
				System.out.println(i+":"+list.get(i).getSpotReason());
			}
		}
		return null;
	}
	
	@Override
	public String getBsCaliber(String lng, String lat, String problemId) {
		List<BsParaInfoManage> list = bsParaInfoManageMapper.selectByBsType("宏站");
		System.out.println(list.size());
		return null;
	}
}

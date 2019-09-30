package com.example.controller;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.service.TicketService;

@Controller
@RequestMapping("/TicketController")
public class TicketController {

	@Resource
	TicketService ticketService;
	
	@RequestMapping(value="getReason")
	@ResponseBody
	public Map<String, Object> getReason(String lng,String lat,String problemId){
		Map<String, Object> map = new HashMap<String, Object>();
		ticketService.getBlackSpotCaliber(lng, lat, problemId);
		//ticketService.getBsCaliber(lng, lat, problemId);
		map.put("0", "456");
		return map;
	}
	
	
}

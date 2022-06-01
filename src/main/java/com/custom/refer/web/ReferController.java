package com.custom.refer.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.custom.refer.dto.ControllerListRequestDTO;
import com.custom.refer.dto.ControllerListResponseDTO;
import com.custom.refer.service.ReferService;
import com.custom.refer.vo.ControllerInfoVO;

@Controller
public class ReferController {

	@Autowired
	ReferService referService;
	
	@RequestMapping(value = "/")
	String referView(ControllerListRequestDTO requestDTO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("hi");
		return "referPage";
	}
	
	@RequestMapping(value = "/controllerList")
	@ResponseBody ControllerListResponseDTO controllerList(ControllerListRequestDTO requestDTO, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		List<Class> controllerClassList = referService.getControllerClassList();
		List<ControllerInfoVO> controllerInfoList = referService.getControllerInfoList(controllerClassList);
		
		ControllerListResponseDTO result = new ControllerListResponseDTO(controllerInfoList);
		
		return result;
	}
	
}

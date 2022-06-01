package com.custom.api.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.custom.api.test.dto.TestApi1RequestDTO;
import com.custom.api.test.dto.TestApi1ResponseDTO;
import com.custom.api.test.dto.TestApi2RequestDTO;
import com.custom.api.test.dto.TestApi2ResponseDTO;
import com.custom.api.test.dto.TestApi3RequestDTO;
import com.custom.api.test.dto.TestApi3ResponseDTO;
import com.custom.cmmn.base.BaseController;

@Controller
public class ApiDocTestController extends BaseController{

	@RequestMapping(value = "/1")
	public TestApi1ResponseDTO testApi1(TestApi1RequestDTO requestDTO, HttpServletRequest request, HttpServletResponse response) {
		
		return null;
	}

	@RequestMapping(value = "/2")
	public TestApi2ResponseDTO testApi2(TestApi2RequestDTO requestDTO, HttpServletRequest request, HttpServletResponse response) {
		
		return null;
	}
	
	@RequestMapping(value = "/3")
	public TestApi3ResponseDTO testApi3(TestApi3RequestDTO requestDTO, HttpServletRequest request, HttpServletResponse response) {
	
		return null;
	}
}

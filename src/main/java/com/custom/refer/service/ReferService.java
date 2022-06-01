package com.custom.refer.service;

import java.lang.reflect.Method;
import java.util.List;

import com.custom.refer.vo.ApiInfoVO;
import com.custom.refer.vo.ControllerInfoVO;

public interface ReferService {
	public List<ControllerInfoVO> getControllerInfoList(List<Class> classList) throws Exception;
	public List<Class> getControllerClassList() throws Exception;
	public List<ApiInfoVO> getApiList(List<Method> methodList)	throws Exception;
}

package com.custom.refer.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.stereotype.Service;

import com.custom.cmmn.filter.ApiReferFilter;
import com.custom.refer.service.ReferService;
import com.custom.refer.vo.ApiInfoVO;
import com.custom.refer.vo.ControllerInfoVO;
import com.custom.refer.vo.RequestDtoInfoVO;
import com.custom.refer.vo.ResponseDtoInfoVO;

@Service
public class ReferServiceImpl implements ReferService {

	@Override
	public List<ControllerInfoVO> getControllerInfoList(List<Class> classList) throws Exception {
		
		List<ControllerInfoVO> result = new ArrayList<ControllerInfoVO>();
		
		for(Class clzz : classList) {
			ControllerInfoVO controllerVO = null;
			List<ApiInfoVO> apiList = getApiList(clzz.getDeclaredMethods());
			
			controllerVO = new ControllerInfoVO(clzz.getName(), apiList);
			result.add(controllerVO);
		}
		
		return result;
	}
	
	

	@Override
	public List<Class> getControllerClassList() throws Exception {
		
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(true);
		ApiReferFilter controllerFilter = new ApiReferFilter("ANNOTATION","CONTROLLER");
		ApiReferFilter classFilter = new ApiReferFilter("CLASS");
		
		scanner.addExcludeFilter(controllerFilter);
		scanner.addIncludeFilter(classFilter);
		
		Set<BeanDefinition> classSet = scanner.findCandidateComponents("/com/custom"); // basepackage ������ ��� ��Ű���� ������� �о�´�
		
		List<Class> result = new ArrayList<Class>();
		
		for(BeanDefinition clss : classSet) {
			Class clzz = Class.forName(clss.getBeanClassName());
			result.add(clzz);
		}
		
		return result;
		
//		File[] files = new File(dir).listFiles();
//		
//		for(File file : files) {
//			String fileName = file.getName();
//			if(file.isDirectory()) {
//				System.out.println(file.getAbsolutePath());
//				getController(file.getAbsolutePath(), controllerList);
//			} else if(fileName.contains("Controller") && "Controller.class".equals(fileName.substring(fileName.length()-16))){
//				System.out.println(fileName);
//				controllerList.add(file);
//			}
//			System.out.println(fileName);
//		}
		//
//		return controllerList;
	}



	@Override
	public List<ApiInfoVO> getApiList(Method[] methodList) throws Exception {
		
		List<ApiInfoVO> result = new ArrayList<ApiInfoVO>();
		
		for(Method method : methodList) {
			ApiInfoVO vo = null;
			ResponseDtoInfoVO responseVO = null;
			RequestDtoInfoVO requestVO = null;
			List<RequestDtoInfoVO> tempRequestList = new ArrayList<RequestDtoInfoVO>();
			List<ResponseDtoInfoVO> tempResponseList = new ArrayList<ResponseDtoInfoVO>();
			
			Class[] paramTypes = method.getParameterTypes();
			for(Class c : paramTypes) {
				String paramName = c.getName();
				if(paramName.contains("DTO") && "DTO".equals(paramName.substring(paramName.length()-3))) {
					for(Field f : c.getDeclaredFields()) {
						requestVO = new RequestDtoInfoVO(f.getName(),f.getType().toString());
						tempRequestList.add(requestVO);
					}
					break;
				}
			}
			for(Field f : method.getReturnType().getDeclaredFields()) {
				responseVO = new ResponseDtoInfoVO(f.getName(),f.getType().toString());
				tempResponseList.add(responseVO);
			}
			vo = new ApiInfoVO(method.getName(), tempRequestList, tempResponseList);
			result.add(vo);
		}
		
		return null;
	}

}

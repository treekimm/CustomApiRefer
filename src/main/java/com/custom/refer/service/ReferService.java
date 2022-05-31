package com.custom.refer.service;

import java.io.File;
import java.util.List;

import com.custom.refer.vo.ControllerInfoVO;

public interface ReferService {
	public List<ControllerInfoVO> getControllerInfoList() throws Exception;
	public List<Class> getControllerList() throws Exception;
}

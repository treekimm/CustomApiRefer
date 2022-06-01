package com.custom.refer.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ControllerInfoVO {
	private String controllerName;
	private List<ApiInfoVO> apiList;
}

package com.custom.refer.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ApiInfoVO {
	private String apiName;
	private List<RequestDtoInfoVO> request;
	private List<ResponseDtoInfoVO> response;
	
}

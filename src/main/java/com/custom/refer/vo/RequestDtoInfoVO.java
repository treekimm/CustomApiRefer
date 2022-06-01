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
public class RequestDtoInfoVO {
	private String key;
	private String type;
	private List<RequestDtoInfoVO> innerField;
	
	public RequestDtoInfoVO(String key, String type) {
		this.key = key;
		this.type = type;
	}
}

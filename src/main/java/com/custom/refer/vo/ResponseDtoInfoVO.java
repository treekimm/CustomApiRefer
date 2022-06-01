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
public class ResponseDtoInfoVO {
	private String key;
	private String type;
	private List<ResponseDtoInfoVO> innerField;
	
	public ResponseDtoInfoVO(String key, String type) {
		this.key = key;
		this.type = type;
	}
}

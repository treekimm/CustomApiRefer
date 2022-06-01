package com.custom.api.test.dto;

import com.custom.cmmn.base.BaseRequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TestApi1RequestDTO extends BaseRequestDTO{
	private String testApi1RequestDtoField1;
	private String testApi1RequestDtoField2;
	private String testApi1RequestDtoField3;
}

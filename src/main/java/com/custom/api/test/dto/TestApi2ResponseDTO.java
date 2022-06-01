package com.custom.api.test.dto;

import java.util.List;

import com.custom.api.test.vo.TestApi1VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TestApi2ResponseDTO {
	private String testApi1ResponseDtoField1;
	private String testApi1ResponseDtoField2;
	private String testApi1ResponseDtoField3;
	private List<TestApi1VO> testApi1ReponseDtoObjField;
}

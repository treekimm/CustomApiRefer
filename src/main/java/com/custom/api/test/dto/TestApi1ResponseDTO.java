package com.custom.api.test.dto;

import java.util.List;

import com.custom.api.test.vo.TestApi1VO;
import com.custom.cmmn.base.BaseResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TestApi1ResponseDTO extends BaseResponseDTO{
	private String testApi1ResponseDtoField1;
	private String testApi1ResponseDtoField2;
	private String testApi1ResponseDtoField3;
	private List<TestApi1VO> testApi1ReponseDtoObjField;
	
}

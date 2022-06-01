package com.custom.api.test.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TestApi2VO {
	private String test2VoField1;
	private String test2VoField2;
	private String test2VoField3;
	private List<TestApi2SubVO> test2SubVoObj;
}

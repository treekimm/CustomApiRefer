package com.custom.refer.dto;

import java.util.List;

import com.custom.refer.vo.ControllerInfoVO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ControllerListResponseDTO {
	private List<ControllerInfoVO> result;
}

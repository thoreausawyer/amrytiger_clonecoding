package com.army.armytiger.qna.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.army.armytiger.command.QnaVO;
import com.army.armytiger.util.Criteria;

@Mapper
public interface QnaMapper {


	//리스트
	public ArrayList<QnaVO> getQnaList(@Param("user_id") String user_id,
									   @Param("cri") Criteria cri);

	//질문등록
	public int qnaRegist(QnaVO vo);
}

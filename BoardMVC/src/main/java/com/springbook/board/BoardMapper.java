package com.springbook.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
// mybatis에서 사용하기 위해
public interface BoardMapper {
	public List<BoardVO> getBoardList();
}

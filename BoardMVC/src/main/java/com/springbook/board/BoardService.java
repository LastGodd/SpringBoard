package com.springbook.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// Service - Controller의 로직담당
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public List<BoardVO> getBoardList() {
		return mapper.getBoardList();
	}
}

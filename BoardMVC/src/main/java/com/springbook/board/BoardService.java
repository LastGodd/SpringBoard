package com.springbook.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// Service - Controller의 로직담당
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public int insBoard(BoardVO param) {
		return mapper.insBoard(param);
	}
	
	public List<BoardVO> selBoardList() {
		return mapper.selBoardList();
	}
	
	public BoardVO selBoard(BoardVO param) {
		return mapper.selBoard(param);
	}
	
	public void boardUpd(BoardVO param) {
		mapper.boardUpd(param);
	}
	
	public int boardDel(int param) {
		return mapper.boardDel(param);
	}
}

package gd.fintech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gd.fintech.mapper.BoardMapper;
import gd.fintech.vo.Board;

@Service
@Transactional
public class BoardService {
	@Autowired private BoardMapper boardMapper;
	
	//리스트
	public List<Board> getBoardList(){
		List<Board> boardList = boardMapper.selectBoardList();
		return boardList;
	}
	
	//내용
	public Board getDetailBoard(int boardNo) {
		Board board = boardMapper.detailBoard(boardNo);
		return board;
	}
	//추가 
	public int insertBoard(Board board) {
		return boardMapper.insertBoard(board);
	}
	//수정 
	public int updateBoard(Board board) {
		return boardMapper.updateBoard(board);
	}
	//삭제
	public int deleteBoard(int boardNo) {
		return boardMapper.deleteBoard(boardNo);
	}
}

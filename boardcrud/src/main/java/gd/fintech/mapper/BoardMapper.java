package gd.fintech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gd.fintech.vo.Board;

@Mapper
public interface BoardMapper {
	
	//게시글 목록 
	List<Board> selectBoardList(); 
	
	//상세 내용 
	Board detailBoard(int boardNo);
	
	//상세내용 수정
	int updateBoard(Board board);
	
	//작성
	int insertBoard(Board board);
	
	//삭제
	int deleteBoard(int boardNo);
}

package gd.fintech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gd.fintech.service.BoardService;
import gd.fintech.vo.Board;

@Controller
public class BoardController {
	@Autowired private BoardService boardService;

	//리스트 
	@GetMapping("/board")
	public String boardList(Model model) {
	List<Board> boardList = boardService.getBoardList();
	
	model.addAttribute("boardList", boardList);
	return "board";
}
	//상세내용 
	@GetMapping("/detailBoard")
	public String boardList(Model model, @RequestParam(value="boardNo")int boardNo) {
		Board detailBoard = boardService.getDetailBoard(boardNo);
		model.addAttribute("detailBoard", detailBoard);
		return "detailBoard";
	}
	// 입력 폼
	@GetMapping("/insertBoard")
	public String insertBoard() {
		return "insertBoard";
	}
	// 입력 액션
	@PostMapping ("/insertBoard")
	public String insertBoard(Board board) {
		boardService.insertBoard(board);
		return "insertBoard";
	}
	//내용수정 폼
	@GetMapping("/updateBoard")
	public String updateBoard(Model model, @RequestParam(value="boardNo") int boardNo) {
	Board board = boardService .getDetailBoard(boardNo);
	model.addAttribute("board", board);
	return "updateBoard";
	}
	//내용수정 액션 
	@PostMapping ("/updateBoard")
	public String updateBoard(Board board) {
		boardService.updateBoard(board);
		return "redirect:/updateBoard?boardNo="+board.getBoardNo();
	}
	// 삭제
	@GetMapping("/deleteBoard")
	public String deleteBoard(@RequestParam(value = "boardNo")int boardNo) {
		boardService.deleteBoard(boardNo);
		return "redirect:/board";
	}
}

package com.example.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void create(BoardVO board) {
		this.sqlSession.insert("Board.insertSP",board);//namespace.id
	}

	@Override
	public void update(BoardVO board) {

	}

	@Override
	public void answer(BoardVO board) {

	}

	@Override
	public void read(Map map) {

	}

	@Override
	public void readAll(Map map) {

	}

	@Override
	public void getTotalCount(Map map) {

	}

	@Override
	public void delete(int idx) {

	}

}
package com.project.review.mapper;

import java.util.ArrayList;
import java.util.List;

import com.project.review.VO.ReviewVO;

public interface ReviewMapper {
   public String reviewBoard();
   //public String reviewWrite();
   //TODO: pno 들어오면 쿼리 수정해주세요~
   public int reviewRegist(ReviewVO vo);
   public List<ReviewVO> getList();
}
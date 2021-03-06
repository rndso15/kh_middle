package com.kh.middle.DataBase.Service;

import java.util.List;

import com.kh.middle.bean.board.product;
import com.kh.middle.bean.user.user_main;
import com.kh.middle.review.vo.Review;   


public interface DB_Service {

	public String selectData() throws Exception;
	
	// user Service start 
	public List<user_main> select_user_main() throws Exception;

	// user Service end
	
	// product Service start
	public List<product> select_board_product() throws Exception;
	
	// reviewDao_select
	public List<Review> select_review(String uni_id) throws Exception;
		
	// reviewDao_insert
	public void  insert_review(Review review) throws Exception;	
	
	// reviewDao_avg
	public float review_avg(String uni_id) throws Exception;
	
	
}

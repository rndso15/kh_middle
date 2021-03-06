package com.kh.middle.review.vo;

public class Review {
	
	int review_no;	//게시글 번호
	String uni_id;  //주유소 아이디
	String user_id; //회원 아이디
	int rating; // 평점을 위한 필드추가
	String content;	//리뷰 내용

	public Review() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Review(String uni_id, String user_id, int rating, String content) {
		super();
		this.uni_id = uni_id;
		this.user_id = user_id;
		this.rating = rating;
		this.content = content;
	}


	public Review(int review_no, String uni_id, String user_id, int rating, String content) {
		super();
		this.review_no = review_no;
		this.uni_id = uni_id;
		this.user_id = user_id;
		this.rating = rating;
		this.content = content;
	}

	public int getReview_no() {
		return review_no;
	}

	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}

	public String getUni_id() {
		return uni_id;
	}

	public void setUni_id(String uni_id) {
		this.uni_id = uni_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Review [review_no=" + review_no + ", uni_id=" + uni_id + ", user_id=" + user_id + ", rating=" + rating
				+ ", content=" + content + "]";
	}

	
	
	
	
	
	
}

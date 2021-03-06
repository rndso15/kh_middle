package com.kh.middle.memberdb.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.middle.bean.member.Member;

@Repository("MemberDao")
public class MemberDao implements MemberDaoInter{

	@Autowired  
	private SqlSessionTemplate sqlSession;
	
	@Override
	public Member memberLogin(Member m) throws Exception {
		
		return sqlSession.selectOne("login_member",m); 
	}
	@Override
	public String idCheck(String id) throws Exception {

		return sqlSession.selectOne("join_id_check",id);
	}
	@Override
	public Member joinImple(Member m) throws Exception {
		sqlSession.insert("join_imple",m);
		
		return sqlSession.selectOne("login", m);
	}
	@Override
	public Member kakao_id_check(Member m) throws Exception {
		
		return sqlSession.selectOne("kakao_id_check",m);
		
	} 
	@Override 
	public void kakaoJoin(Member m) throws Exception {
		sqlSession.insert("kakao_join", m);
	}
	@Override
	public String selectNickname(String nickname) {
		System.out.println("nick : "+nickname);
		return sqlSession.selectOne("nick_name_select", nickname);
	}
	@Override
	public void withdraw(String user_id) {
	
		sqlSession.update("member_withdraw", user_id);
		
	}
	@Override
	public void updateKakaoLeaveYn(String user_id) {
		sqlSession.update("update_kakao_leave_yn", user_id);
	}

}

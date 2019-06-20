package com.clear.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clear.dao.MemberDao;
import com.clear.model.Member;


@Service("memberService")
public class MemberServiceImpl implements MemberService {

  @Autowired
  private MemberDao memberDao;
  
  @Transactional
  @Override
  public Member getMember(Member user) {
	  return memberDao.getMember(user);
  }

  @Override
  public Member getMail(Integer memberId) {
	  return memberDao.getMail(memberId);
  }
  
  @Override
  public List<Member> getAllUser() {
	  return this.memberDao.getAllUser();
  }
  @Override
	public boolean saveUser(Member user){
		try {
			java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(System.currentTimeMillis());
			user.setRegisterTime(sqlTimestamp);
			memberDao.save(user);
		//	if(true) {
		//		  throw new Exception();
		//	}
			return true;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}catch(Exception ex) {
			return false;
		}
		
	}
  

}
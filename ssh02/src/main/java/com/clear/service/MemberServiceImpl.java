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
  public Member getMember(String account, String password) throws Exception {
    //
	  if(true) {
		  throw new Exception();
	  }
	  
	  return memberDao.getMember(account,password);
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
	public boolean saveUser(Member user) {
		try {
			memberDao.save(user);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
  

}
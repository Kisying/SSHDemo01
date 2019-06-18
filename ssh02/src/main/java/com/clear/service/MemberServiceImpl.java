package com.clear.service;

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
  public Member getMember(String account, String password) {
    return memberDao.getMember(account,password);
  }

  @Override
  public Member getMail(Integer memberId) {
	// TODO Auto-generated method stub
	return null;
  }
  

}
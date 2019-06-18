package com.clear.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clear.model.Member;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

  @Autowired
  private SessionFactory sessionFactory;
  
  @Override
  public Member getMember(String account, String password) {
	  
	  
    return sessionFactory.getCurrentSession().get(Member.class, account);
  }
  public Member getMail(Integer memberId) {
    return sessionFactory.getCurrentSession().get(Member.class, memberId);
  }

}
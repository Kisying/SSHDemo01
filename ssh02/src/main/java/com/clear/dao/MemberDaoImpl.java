package com.clear.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clear.model.Member;


@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

  @Autowired
  private SessionFactory sessionFactory;
  
  @Override
  public Member getMember(String memberId, String password) {
    return sessionFactory.openSession().get(Member.class, memberId);
  }
  @Override
  public Member getMail(Integer memberId) {
    return sessionFactory.openSession().get(Member.class, memberId);
  }
  
  @Override
  public List<Member> getAllUser() {
		Session session = sessionFactory.openSession();
		Query<List<Member>> q = session.createQuery("from MEMBER");
		//List<Member> personsList = session.createQuery("from MEMBER").list();
		
		/*
		for(Member p : personsList){
			logger.info("Person List::"+p);
		}
		*/
		return null;
	}

}
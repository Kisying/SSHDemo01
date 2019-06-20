package com.clear.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clear.model.Member;


@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

  @Autowired
  private SessionFactory sessionFactory;
  
  @Override
  public Member getMember(Member Member) {
	Session session = sessionFactory.openSession();
    Query query = session.createQuery("from Member where memberName = ? and password = ?");
    query.setParameter(0, Member.getMemberName());
    query.setParameter(1, Member.getPassword());
    Member mb = (Member) query.uniqueResult();
	session.close();
    return mb ;
  }
  @Override
  public Member getMail(Integer memberId) {
    return sessionFactory.openSession().get(Member.class, memberId);
  }
  @Override
  public List<Member> getAllUser() {
		Session session = sessionFactory.openSession();
		
		List<Member> personsList = session.createQuery("from Member").list();
		
		/*
		for(Member p : personsList){
			logger.info("Person List::"+p);
		}
		*/
		session.close();
		return personsList;
	}
  @Override
  public void save(Member Member) {
	  Session session = sessionFactory.openSession();
	  Transaction t = session.beginTransaction();
	  session.save(Member);
	  t.commit();
	  session.close();

  }

}
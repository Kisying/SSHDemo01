package com.clear.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clear.dao.MemberDao;
import com.clear.model.MailMail;
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
	public boolean saveUser(Member user) {
		try {
			java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(System.currentTimeMillis());
			user.setRegisterTime(sqlTimestamp);
			memberDao.save(user);
			// if(true) {
			// throw new Exception();
			// }
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean sendMail(Member Member) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-Mail.xml");
		MailMail mm = (MailMail) context.getBean("mailMail");
		Member mb = memberDao.getMemberPwd(Member);
		try {
			mm.sendMail("Test@gmail.com", Member.getMemberEmail(), "忘記密碼信件",
					"這是你的帳號: " + mb.getMemberName().toString() + "\n\n 這是你的密碼: " + mb.getPassword());
			return true;

		} catch (Exception ex) {
			return false;
		}
	}

}
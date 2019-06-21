package com.clear.service;

import java.util.List;

import com.clear.model.Member;

public interface MemberService {
	public Member getMember(Member user) ;
	public Member getMail(Integer memberId);
	public List<Member> getAllUser();
	public boolean saveUser(Member user);
	public boolean sendMail(Member user);
}

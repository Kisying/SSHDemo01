package com.clear.service;

import java.util.List;

import com.clear.model.Member;

public interface MemberService {
	public Member getMember(String account, String password) throws Exception;
	public Member getMail(Integer memberId);
	public List<Member> getAllUser();
}

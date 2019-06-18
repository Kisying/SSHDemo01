package com.clear.service;

import com.clear.model.Member;

public interface MemberService {
	public Member getMember(String account, String password);
	public Member getMail(Integer memberId);
}

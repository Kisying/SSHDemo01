package com.clear.dao;

import java.util.List;

import com.clear.model.Member;

public interface MemberDao {
	 Member getMember(String account, String password);
	 Member getMail(Integer memberId);
	 List<Member>getAllUser();

}

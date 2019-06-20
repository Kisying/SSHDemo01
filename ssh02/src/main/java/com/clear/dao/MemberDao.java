package com.clear.dao;

import java.io.Serializable;
import java.util.List;

import com.clear.model.Member;

public interface MemberDao {
	 Member getMember(Member Member);
	 Member getMail(Integer memberId);
	 List<Member>getAllUser();
	 void save(Member Member);

}

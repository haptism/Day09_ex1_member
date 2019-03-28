package com.iu.view;

import com.iu.member.Member;

// view 라는 메서드는 출력을 담당하는 메서드

public class MemberVIew {

	public void view(String message) {
		System.out.println(message);
	}

	// member 한명의 정보를 출력하는 메서드

	public void view(Member member) { // 멤버 메소드를 출력
		System.out.println("ID : " + member.getId());
		System.out.println("PW : " + member.getPw());
		System.out.println("AGE : " + member.getAge());
		System.out.println("EMAILL : " + member.getEmail());
		System.out.println("PHONE : " + member.getPhone());
	}

	// member 들의 정보를 출력하는 메서드
	public void view2(Member[] members) { // 멤버 배열을 출력
		for (int i = 0; i < members.length; i++) {
			Member member = members[i];
//			System.out.println("ID : " + member.getId());
//			System.out.println("PW : " + member.getPw());
//			System.out.println("AGE : " + member.getAge());
//			System.out.println("EMAILL : " + member.getEmail());
//			System.out.println("PHONE : " + member.getPhone());
			this.view(member);
		}
	}
}

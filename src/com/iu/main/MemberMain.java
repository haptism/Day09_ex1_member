package com.iu.main;

import com.iu.member.Member;
import com.iu.member.MemberController;
import com.iu.member.MemberInput;
import com.iu.view.MemberVIew;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberController mc = new MemberController();
		mc.start();

		// d1 == d2 (x)

//		String d1 = "test";
//		String d2 = "test";
//		System.out.println(d1.contentEquals(d2));

		// 프로그램을 시작
		// 프로그램 테스트 목적

//		MemberInput mi = new MemberInput();
//		MemberVIew mv = new MemberVIew();
//		Member m = mi.memberJoin();
//		Member[] members = new Member[100];
//		for (int i = 0; i < members.length; i++) {
//			Member member = new Member();
//			member.setId("id" + i);
//			member.setPw("pw" + i);
//			members[i] = member;
//			break;
//		}
//
//		mi.memberLogin(members);
//		mv.view(m);

	}
}

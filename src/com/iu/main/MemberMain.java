package com.iu.main;

import com.iu.member.Member;
import com.iu.member.MemberInput;
import com.iu.view.MemberVIew;

public class MemberMain {

	public static void main(String[] args) {
		

		// d1 == d2 (x)

		String d1 = "test";
		String d2 = "test";
		System.out.println(d1.contentEquals(d2));

		// 프로그램을 시작
		// 프로그램 테스트 목적

		MemberInput mi = new MemberInput();
		MemberVIew mv = new MemberVIew();
		Member m = mi.memberJoin();
		mv.view(m);

	}
}

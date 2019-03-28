package com.iu.member;

import java.util.Scanner;

public class MemberInput {
	private Scanner sc;

	public MemberInput() {
		sc = new Scanner(System.in);

	}

	// memberLogin
	// 매개변수로 Member []을 받아서
	// member를 리턴

	public Member memberLogin(Member[] members) {
		Member member = null;

		System.out.println("ID를 입력하세요");
		String id = sc.next();

		System.out.println("PW를 입력하세요");
		String pw = sc.next();

		for (int i = 0; i < members.length; i++) {
			if (id.contentEquals(members[i].getId()) && pw.equals(members[i].getPw()))
				;
			member = members[i];
			break;
		}
		return member;
	}

	// memberJoin
	// id, pw, 나이, 이메일, 전화번호
	// member를 리턴

	public Member memberJoin() { // 멤버 메소드를 출력

		Member member = new Member();

		System.out.println("ID 입력하세요");
		String id = sc.next();
		member.setId(id);

		System.out.println("PW 입력하세요");
//		String pw = sc.next();
		member.setPw(sc.next());

		System.out.println("AGE 입력하세요");
		member.setAge(sc.nextInt());

		System.out.println("EMAILL 입력하세요");
		member.setEmail(sc.next());

		System.out.println("PHONE 입력하세요");
		member.setPhone(sc.next());

		return member;

	}
}

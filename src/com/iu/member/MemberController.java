package com.iu.member;

import java.util.Scanner;

import com.iu.view.MemberVIew;

public class MemberController {

	private Scanner sc;
	private Member [] members;
	private MemberInput mi;
	private MemberAdd ma;
	private MemberVIew mv;
	

	public MemberController() {
		// 접근지정자 클래스명과 동일하게
		sc = new Scanner(System.in);
		members = new Member[0];
		mi = new MemberInput();
		ma = new MemberAdd();
		mv = new MemberVIew();
//		System.out.println(members.length);

	}
	
	// start

	// 1. 회원가입
	// 2. 로그인
	// 3. 회원 정보 전체 출력
	// 4. 프로그램 종료

	public void start() {
		boolean check = true;

		while (check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 전체 출력");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
			switch (select) {
			
			case 1:
				Member m = mi.memberJoin();
				members = ma.add(members, m);
//				ma.add(members, m);
//				System.out.println("가입");
				break;
			case 2:
				System.out.println("로그인");
				Member member = mi.memberLogin(members);
				if(member != null) {
					System.out.println();
				}
				break;
			case 3:
				mv.view(members);
//				System.out.println("정보 출력");
				break;
			default:
				check = !check; // check = false
			}
		}
	}
}
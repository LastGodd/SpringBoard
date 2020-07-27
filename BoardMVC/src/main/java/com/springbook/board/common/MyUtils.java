package com.springbook.board.common;

import org.mindrot.jbcrypt.BCrypt;

public class MyUtils {
	
	public static String gensalt() {
		return BCrypt.gensalt();
		//입력한 비번 + salt = 60자리 비번
	}
	
	public static String hashPassword(String pw, String salt) {
		return BCrypt.hashpw(pw, salt);
		// DB에 60자리 비밀번호 만드는 것
	}
}

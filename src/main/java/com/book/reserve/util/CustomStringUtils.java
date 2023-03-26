package com.book.reserve.util;

import java.security.SecureRandom;

public class CustomStringUtils {
	private static final SecureRandom RANDOM = new SecureRandom();

	/**
	 * 무작위 String 을 생성
	 *
	 * @param length 무작위 String 의 길이
	 * @return 무작위 String
	 */
	public static String createRandomString(int length) {
		StringBuilder buf = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int rndIntVal = RANDOM.nextInt(99); // 0 <= n < 99
			if (rndIntVal % 3 == 0) {
				buf.append((char)(RANDOM.nextInt(26) + 97));
			} else if (rndIntVal % 3 == 1) {
				buf.append((RANDOM.nextInt(10)));
			} else {
				buf.append((char)(RANDOM.nextInt(26) + 65));
			}
		}

		return buf.toString();
	}
}

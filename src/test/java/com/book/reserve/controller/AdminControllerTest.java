package com.book.reserve.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.context.annotation.Import;

import com.book.reserve.config.BeanExtends;
import com.book.reserve.config.RestDocsConfiguration;

@AutoConfigureRestDocs
@Import(RestDocsConfiguration.class)
public class AdminControllerTest extends BeanExtends {

	/**
	 * 어드민 계정 생성
	 */
	@Test
	void testCreateAdminAccount() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}

	/**
	 * 어드민 로그인
	 */
	@Test
	void testLoginAdminAccount() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}

	/**
	 * 도서관 정보 생성
	 */
	@Test
	void testCreateLibraryInfo() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}

	/**
	 * 도서관 정보 조회
	 */
	@Test
	void testGetLibraryInfo() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}

	/**
	 * 도서관 정보 수정
	 */
	@Test
	void testUpdateLibraryInfo() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}

	/**
	 * 도서관 정보 삭제
	 */
	@Test
	void testRemoveLibraryInfo() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}


	/**
	 * 도서 정보 생성
	 */
	@Test
	void testCreateBookInfo() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}

	/**
	 * 도서 정보 조회
	 */
	@Test
	void testGetBookInfo() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}

	/**
	 * 도서 정보 수정
	 */
	@Test
	void testUpdateBookInfo() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}

	/**
	 * 도서 정보 삭제
	 */
	@Test
	void testRemoveBookInfo() throws Exception {
		/* Given */

		/* When */

		/* Then */
	}
}

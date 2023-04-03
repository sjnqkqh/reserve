package com.book.reserve.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_BOOK")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "author", nullable = false)
	private String author;

	@Column(name = "publisher_name", nullable = false)
	private String publisherName;

	@Column(name = "isbn", nullable = false)
	private String isbn;

	@Column(name = "book_information", nullable = false)
	private String bookInformation;

	@Column(name = "book_cover_image", nullable = false)
	private String bookCoverImage;

	@Column(name = "use_yn", nullable = false)
	private char useYn;

	@Column(name = "created_at", nullable = false)
	private LocalDateTime createdAt;

	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;

}
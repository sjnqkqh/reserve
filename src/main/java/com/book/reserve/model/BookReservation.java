package com.book.reserve.model;

import java.time.LocalDateTime;

import com.book.reserve.util.enumCode.YnCode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_BOOK_RESERVATION")
public class BookReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "library_id")
	private Library library;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id")
	private Book book;

	@Column(name = "expired_at", nullable = false)
	private LocalDateTime expiredAt;

	@Column(name = "expired_yn", nullable = false)
	@Enumerated(EnumType.STRING)
	private YnCode expiredYn;

	@Column(name = "expired_reason")
	private String expiredReason;

	@Column(name = "use_yn", nullable = false)
	@Enumerated(EnumType.STRING)
	private YnCode useYn;

}
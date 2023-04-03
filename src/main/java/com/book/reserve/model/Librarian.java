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
@Table(name = "TB_LIBRARIAN")
public class Librarian {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "login_id", nullable = false)
	private String loginId;

	@Column(name = "enc_password", nullable = false)
	private String encPassword;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "email", nullable = false)
	private String email;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "library_id")
	private Library library;

	@Column(name = "access_token")
	private String accessToken;

	@Column(name = "refresh_token")
	private String refreshToken;

	@Column(name = "refresh_token_expired_at")
	private LocalDateTime refreshTokenExpiredAt;

	@Column(name = "use_yn", nullable = false)
	@Enumerated(EnumType.STRING)
	private YnCode useYn;

}